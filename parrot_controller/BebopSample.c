/*
  Copyright (C) 2014 Parrot SA

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions
  are met:
  * Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in
  the documentation and/or other materials provided with the
  distribution.
  * Neither the name of Parrot nor the names
  of its contributors may be used to endorse or promote products
  derived from this software without specific prior written
  permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
  FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
  COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
  OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
  AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
  OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
  SUCH DAMAGE.
*/
/**
 * @file BebopSample.c
 * @brief This file contains sources about basic arsdk example sending commands to a bebop drone to pilot it,
 * receive its battery level and display the video stream.
 * @date 15/01/2015
 */


/*****************************************
 *
 * Pour compiler le placer dans : 
 * SDK_PARROT/packages/Samples/Unix/BebopSample/
 *
 *****************************************/

/*****************************************
 *
 *             include file :
 *
 *****************************************/

#include <stdlib.h>
#include <curses.h>
#include <string.h>
#include <unistd.h>
#include <signal.h>
#include <errno.h>

#include <libARSAL/ARSAL.h>
#include <libARController/ARController.h>
#include <libARDiscovery/ARDiscovery.h>

#include "BebopSample.h"

/*****************************************
 *
 *             define :
 *
 *****************************************/
#define TAG "BebopSample"

#define ERROR_STR_LENGTH 2048

#define BEBOP_IP_ADDRESS "192.168.42.1"
#define BEBOP_DISCOVERY_PORT 44444

#define DISPLAY_WITH_MPLAYER 1

#define FIFO_DIR_PATTERN "/tmp/arsdk_XXXXXX"
#define FIFO_NAME "arsdk_fifo"

#define DECOLLER_INPUT_CODE 1
#define ATTERRIR_INPUT_CODE 2
#define AVANCER_INPUT_CODE 3
#define RECULER_INPUT_CODE 4
#define MONTER_INPUT_CODE 5
#define DESCENDRE_INPUT_CODE 6
#define GAUCHE_INPUT_CODE 7
#define DROITE_INPUT_CODE 8
#define ROTATION_GAUCHE_INPUT_CODE 9
#define ROTATION_DROITE_INPUT_CODE 10
  
#define ELOIGNEMENT_MAX_CODE 11
#define HAUTEUR_MAX_CODE 12
#define VIT_DEPLACEMENT_MAX_CODE 13
#define VIT_HAUTEUR_MAX_CODE 14
#define VIT_ROTATION_MAX_CODE 15
#define QUIT 16

#define MAX_INPUT_LINE_SIZE 1024
#define MAX_COMMAND_NAME_SIZE 3

/*****************************************
 *
 *             private header:
 *
 ****************************************/


/*****************************************
 *
 *             implementation :
 *
 *****************************************/

static char fifo_dir[] = FIFO_DIR_PATTERN;
static char fifo_name[128] = "";

int gIHMRun = 1;
char gErrorStr[ERROR_STR_LENGTH];

FILE *videoOut = NULL;
int frameNb = 0;
ARSAL_Sem_t stateSem;
int isBebop2 = 1;

static void signal_handler(int signal)
{
    gIHMRun = 0;
}

int main (int argc, char *argv[])
{
    // local declarations
    int failed = 0;
    ARDISCOVERY_Device_t *device = NULL;
    ARCONTROLLER_Device_t *deviceController = NULL;
    eARCONTROLLER_ERROR error = ARCONTROLLER_OK;
    eARCONTROLLER_DEVICE_STATE deviceState = ARCONTROLLER_DEVICE_STATE_MAX;
    
    /* Custom implementation */
    int command_code = 0;
    int res = 0;
    int quit = 0;
    int pourcent_vitesse = 0;
    char input_line_buffer[MAX_INPUT_LINE_SIZE+1];

    /* Set signal handlers */
    struct sigaction sig_action = {
        .sa_handler = signal_handler,
    };

    int ret = sigaction(SIGINT, &sig_action, NULL);
    if (ret < 0)
    {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, "ERROR", "Unable to set SIGINT handler : %d(%s)",
                    errno, strerror(errno));
        return 1;
    }
    ret = sigaction(SIGPIPE, &sig_action, NULL);
    if (ret < 0)
    {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, "ERROR", "Unable to set SIGPIPE handler : %d(%s)",
                    errno, strerror(errno));
        return 1;
    }

    if (mkdtemp(fifo_dir) == NULL)
    {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, "ERROR", "Mkdtemp failed.");
        return 1;
    }
    snprintf(fifo_name, sizeof(fifo_name), "%s/%s", fifo_dir, FIFO_NAME);

    if(mkfifo(fifo_name, 0666) < 0)
    {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, "ERROR", "Mkfifo failed: %d, %s", errno, strerror(errno));
        return 1;
    }

    ARSAL_Sem_Init (&(stateSem), 0, 0);
   
    // create a discovery device
    if (!failed)
    {
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- init discovey device ... ");
        eARDISCOVERY_ERROR errorDiscovery = ARDISCOVERY_OK;
        device = ARDISCOVERY_Device_New (&errorDiscovery);

        if (errorDiscovery == ARDISCOVERY_OK)
        {
            ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "    - ARDISCOVERY_Device_InitWifi ...");
            // create a Bebop drone discovery device (ARDISCOVERY_PRODUCT_ARDRONE)

            errorDiscovery = ARDISCOVERY_Device_InitWifi (device, ARDISCOVERY_PRODUCT_BEBOP_2, "bebop2", BEBOP_IP_ADDRESS, BEBOP_DISCOVERY_PORT);
            
            if (errorDiscovery != ARDISCOVERY_OK)
            {
                failed = 1;
                ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Discovery error :%s", ARDISCOVERY_Error_ToString(errorDiscovery));
            }
        }
        else
        {
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Discovery error :%s", ARDISCOVERY_Error_ToString(errorDiscovery));
            failed = 1;
        }
    }

    // create a device controller
    if (!failed)
    {
        deviceController = ARCONTROLLER_Device_New (device, &error);

        if (error != ARCONTROLLER_OK)
        {
            ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG, "Creation of deviceController failed.");
            failed = 1;
        }
    }

    if (!failed)
    {
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- delete discovey device ... ");
        ARDISCOVERY_Device_Delete (&device);
    }

    // add the state change callback to be informed when the device controller starts, stops...
    if (!failed)
    {
        error = ARCONTROLLER_Device_AddStateChangedCallback (deviceController, stateChanged, deviceController);

        if (error != ARCONTROLLER_OK)
        {
            ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG, "add State callback failed.");
            failed = 1;
        }
    }

    // add the command received callback to be informed when a command has been received from the device
    if (!failed)
    {
        error = ARCONTROLLER_Device_AddCommandReceivedCallback (deviceController, commandReceived, deviceController);

        if (error != ARCONTROLLER_OK)
        {
            ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG, "add callback failed.");
            failed = 1;
        }
    }

    if (!failed)
    {
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "Connecting ...");
        error = ARCONTROLLER_Device_Start (deviceController);

        if (error != ARCONTROLLER_OK)
        {
            failed = 1;
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- error :%s", ARCONTROLLER_Error_ToString(error));
        }
    }

    if (!failed)
    {
        // wait state update update
        ARSAL_Sem_Wait (&(stateSem));

        deviceState = ARCONTROLLER_Device_GetState (deviceController, &error);

        if ((error != ARCONTROLLER_OK) || (deviceState != ARCONTROLLER_DEVICE_STATE_RUNNING))
        {
            failed = 1;
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- deviceState :%d", deviceState);
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- error :%s", ARCONTROLLER_Error_ToString(error));
        }
    }

    // send the command that tells to the Bebop to disable streaming
    if (!failed)
    {
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "- send StreamingVideoEnable ... ");
        error = deviceController->aRDrone3->sendMediaStreamingVideoEnable (deviceController->aRDrone3, 0);  //disable
        if (error != ARCONTROLLER_OK)
        {
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "- error :%s", ARCONTROLLER_Error_ToString(error));
            failed = 1;
        }
    }

    
    if (!failed)
    {
      ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "LANCEMENT DE L'ECOUTE SUR STDIN");
        while(!quit) {
            /* Récupération de la commande en entrée */
            if(fgets(input_line_buffer, MAX_INPUT_LINE_SIZE, stdin) == NULL) {
                ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Input error (fgets): %s\n", strerror(errno));
            }

            res = sscanf(input_line_buffer, "%d %d", &command_code, &pourcent_vitesse);
            if (res > 3 || res < 1) {
                ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Input error (sscanf): %s\n", strerror(errno));
            }
          
            switch(command_code)
            {
              case ELOIGNEMENT_MAX_CODE:
                handle_eloignement(pourcent_vitesse,deviceController);
                break;
                
              case HAUTEUR_MAX_CODE:
                handle_hauteur(pourcent_vitesse,deviceController);
                break;
                
              case VIT_DEPLACEMENT_MAX_CODE:
                handle_vit_deplacement(pourcent_vitesse,deviceController);
                break;
                
              case VIT_HAUTEUR_MAX_CODE:
                handle_vit_hauteur(pourcent_vitesse,deviceController);
                break;
                
              case VIT_ROTATION_MAX_CODE:
                handle_vit_rotation(pourcent_vitesse,deviceController);
                break;
                
              case DECOLLER_INPUT_CODE:
                handle_decoller(deviceController);
                break;

              case ATTERRIR_INPUT_CODE:
                handle_atterrir(deviceController);
                break;

              case AVANCER_INPUT_CODE:
                handle_avancer(pourcent_vitesse,deviceController);
                break;

              case RECULER_INPUT_CODE:
                handle_reculer(pourcent_vitesse,deviceController);
                break;

              case MONTER_INPUT_CODE:
                handle_monter(pourcent_vitesse,deviceController);
                break;

              case DESCENDRE_INPUT_CODE:
                handle_descendre(pourcent_vitesse,deviceController);
                break;

              case GAUCHE_INPUT_CODE:
                handle_gauche(pourcent_vitesse,deviceController);
                break;

              case DROITE_INPUT_CODE:
                handle_droite(pourcent_vitesse,deviceController);
                break;

              case ROTATION_GAUCHE_INPUT_CODE:
                handle_rotation_gauche(pourcent_vitesse,deviceController);
                break;

              case ROTATION_DROITE_INPUT_CODE:
                handle_rotation_droite(pourcent_vitesse,deviceController);
                break;
                
              case QUIT:
                quit = 1;
                break;

              default:
                fprintf(stderr, "Unknown command code: %d\n", command_code);
              	break;
            }
            fflush(stdout);

        }
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "FIN DE L'EXECUTION");

    }
    
      



    // we are here because of a disconnection, so safely delete everything
    if (deviceController != NULL)
    {


        deviceState = ARCONTROLLER_Device_GetState (deviceController, &error);
        if ((error == ARCONTROLLER_OK) && (deviceState != ARCONTROLLER_DEVICE_STATE_STOPPED))
        {
            ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "Disconnecting ...");

            error = ARCONTROLLER_Device_Stop (deviceController);

            if (error == ARCONTROLLER_OK)
            {
                // wait state update update
                ARSAL_Sem_Wait (&(stateSem));
            }
        }

        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "ARCONTROLLER_Device_Delete ...");
        ARCONTROLLER_Device_Delete (&deviceController);
    }

    ARSAL_Sem_Destroy (&(stateSem));

    unlink(fifo_name);
    rmdir(fifo_dir);

    ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "-- END --");

    return EXIT_SUCCESS;
}

/*****************************************
 *
 *             private implementation:
 *
 ****************************************/

void handle_decoller(void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendPilotingTakeOff(deviceController->aRDrone3);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received decoller() from stdin\n");
}

void handle_atterrir(void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendPilotingLanding(deviceController->aRDrone3);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received atterrir() from stdin\n");
}

void handle_avancer(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDPitch(deviceController->aRDrone3, pourcent_vitesse);
  deviceController->aRDrone3->setPilotingPCMDFlag(deviceController->aRDrone3, 1);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received avancer(%d) from stdin\n", pourcent_vitesse);
}

void handle_reculer(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDPitch(deviceController->aRDrone3, -pourcent_vitesse);
  deviceController->aRDrone3->setPilotingPCMDFlag(deviceController->aRDrone3, 1);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received reculer(%d) from stdin\n", -pourcent_vitesse);
}

void handle_monter(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDGaz(deviceController->aRDrone3, pourcent_vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received monter(%d) from stdin\n", pourcent_vitesse);
}

void handle_descendre(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDGaz(deviceController->aRDrone3, -pourcent_vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received descendre(%d) from stdin\n", -pourcent_vitesse);
}

void handle_gauche(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDRoll(deviceController->aRDrone3, -pourcent_vitesse);
  deviceController->aRDrone3->setPilotingPCMDFlag(deviceController->aRDrone3, 1);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received gauche(%d) from stdin\n", -pourcent_vitesse);
}

void handle_droite(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDRoll(deviceController->aRDrone3, pourcent_vitesse);
  deviceController->aRDrone3->setPilotingPCMDFlag(deviceController->aRDrone3, 1);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received droite(%d) from stdin\n", pourcent_vitesse);
}

void handle_rotation_gauche(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDYaw(deviceController->aRDrone3, -pourcent_vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received rotation_gauche(%d) from stdin\n", -pourcent_vitesse);
}

void handle_rotation_droite(int pourcent_vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->setPilotingPCMDYaw(deviceController->aRDrone3, pourcent_vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received rotation_droite(%d) from stdin\n", pourcent_vitesse);
}

void handle_eloignement(int distance,void *customData) 
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendPilotingSettingsMaxDistance(deviceController->aRDrone3, (float)distance);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received eloigment_max(%d) from stdin\n", distance);
}

void handle_hauteur(int distance,void *customData) 
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
   deviceController->aRDrone3->sendPilotingSettingsMaxAltitude(deviceController->aRDrone3, (float)distance);
   ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received hauteur_max(%d) from stdin\n", distance);
}

void handle_vit_deplacement(int vitesse,void *customData)
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendPilotingSettingsMaxTilt(deviceController->aRDrone3, (float)vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received vitesse_deplacement(%d) from stdin\n", vitesse);
}

void handle_vit_hauteur(int vitesse,void *customData) 
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendSpeedSettingsMaxVerticalSpeed(deviceController->aRDrone3, (float)vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received vitesse_hauteur(%d) from stdin\n", vitesse);
}
void handle_vit_rotation(int vitesse,void *customData) 
{
  ARCONTROLLER_Device_t *deviceController = (ARCONTROLLER_Device_t *)customData;
  deviceController->aRDrone3->sendSpeedSettingsMaxRotationSpeed(deviceController->aRDrone3, (float)vitesse);
  ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "Received vitesse_rotation(%d) from stdin\n", vitesse);
}

// called when the state of the device controller has changed
void stateChanged (eARCONTROLLER_DEVICE_STATE newState, eARCONTROLLER_ERROR error, void *customData)
{
    ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "    - stateChanged newState: %d .....", newState);

    switch (newState)
    {
    case ARCONTROLLER_DEVICE_STATE_STOPPED:
        ARSAL_Sem_Post (&(stateSem));
        //stop
        gIHMRun = 0;

        break;

    case ARCONTROLLER_DEVICE_STATE_RUNNING:
        ARSAL_Sem_Post (&(stateSem));
        break;

    default:
        break;
    }
}

static void cmdBatteryStateChangedRcv(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary)
{
    ARCONTROLLER_DICTIONARY_ARG_t *arg = NULL;
    ARCONTROLLER_DICTIONARY_ELEMENT_t *singleElement = NULL;

    if (elementDictionary == NULL) {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "elements is NULL");
        return;
    }

    // get the command received in the device controller
    HASH_FIND_STR (elementDictionary, ARCONTROLLER_DICTIONARY_SINGLE_KEY, singleElement);

    if (singleElement == NULL) {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "singleElement is NULL");
        return;
    }

    // get the value
    HASH_FIND_STR (singleElement->arguments, ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED_PERCENT, arg);

    if (arg == NULL) {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "arg is NULL");
        return;
    }

    // update UI
    batteryStateChanged(arg->value.U8);
}

static void cmdSensorStateListChangedRcv(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary)
{
    ARCONTROLLER_DICTIONARY_ARG_t *arg = NULL;
    ARCONTROLLER_DICTIONARY_ELEMENT_t *dictElement = NULL;
    ARCONTROLLER_DICTIONARY_ELEMENT_t *dictTmp = NULL;

    eARCOMMANDS_COMMON_COMMONSTATE_SENSORSSTATESLISTCHANGED_SENSORNAME sensorName = ARCOMMANDS_COMMON_COMMONSTATE_SENSORSSTATESLISTCHANGED_SENSORNAME_MAX;
    int sensorState = 0;

    if (elementDictionary == NULL) {
        ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "elements is NULL");
        return;
    }

    // get the command received in the device controller
    HASH_ITER(hh, elementDictionary, dictElement, dictTmp) {
        // get the Name
        HASH_FIND_STR (dictElement->arguments, ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_SENSORSSTATESLISTCHANGED_SENSORNAME, arg);
        if (arg != NULL) {
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "arg sensorName is NULL");
            continue;
        }

        sensorName = arg->value.I32;

        // get the state
        HASH_FIND_STR (dictElement->arguments, ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_SENSORSSTATESLISTCHANGED_SENSORSTATE, arg);
        if (arg == NULL) {
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG, "arg sensorState is NULL");
            continue;
        }

        sensorState = arg->value.U8;
        ARSAL_PRINT(ARSAL_PRINT_INFO, TAG, "sensorName %d ; sensorState: %d", sensorName, sensorState);
    }
}

// called when a command has been received from the drone
void commandReceived (eARCONTROLLER_DICTIONARY_KEY commandKey, ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary, void *customData)
{
    ARCONTROLLER_Device_t *deviceController = customData;

    if (deviceController == NULL)
        return;

    // if the command received is a battery state changed
    switch(commandKey) {
    case ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_BATTERYSTATECHANGED:
        cmdBatteryStateChangedRcv(deviceController, elementDictionary);
        break;
    case ARCONTROLLER_DICTIONARY_KEY_COMMON_COMMONSTATE_SENSORSSTATESLISTCHANGED:
        cmdSensorStateListChangedRcv(deviceController, elementDictionary);
        break;
    default:
        break;
    }
}

void batteryStateChanged (uint8_t percent)
{
    // callback of changing of battery level
}

eARCONTROLLER_ERROR decoderConfigCallback (ARCONTROLLER_Stream_Codec_t codec, void *customData)
{
    return ARCONTROLLER_OK;
}


eARCONTROLLER_ERROR didReceiveFrameCallback (ARCONTROLLER_Frame_t *frame, void *customData)
{
    return ARCONTROLLER_OK;
}

int customPrintCallback (eARSAL_PRINT_LEVEL level, const char *tag, const char *format, va_list va)
{
    // Custom callback used when ncurses is runing for not disturb the IHM

    if ((level == ARSAL_PRINT_ERROR) && (strcmp(TAG, tag) == 0))
    {
        // Save the last Error
        vsnprintf(gErrorStr, (ERROR_STR_LENGTH - 1), (char*)format, va);
        gErrorStr[ERROR_STR_LENGTH - 1] = '\0';
    }

    return 1;
}
