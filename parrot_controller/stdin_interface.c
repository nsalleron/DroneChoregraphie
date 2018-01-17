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
 * @file ihm.c
 * @brief This file contains sources about the interface between DroneDSL and arsdk
 * @date 15/01/2015
 */

/*****************************************
 *
 *             include file :
 *
 *****************************************/

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>

#include <libARSAL/ARSAL.h>

#include "ihm.h"

/*****************************************
 *
 *             define :
 *
 *****************************************/

#define HEADER_X 0
#define HEADER_Y 0

#define INFO_X 0
#define INFO_Y 2

#define BATTERY_X 0
#define BATTERY_Y 4

#define MAX_INPUT_LINE_SIZE 1024
#define MAX_COMMAND_NAME_SIZE 3

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
#define PAUSE_INPUT_CODE 11

/*****************************************
 *
 *             private header:
 *
 ****************************************/
void *IHM_InputProcessing(void *data);

void handle_decoller();
void handle_atterrir();
void handle_avancer(int pourcent_vitesse, int seconde_temps);
void handle_reculer(int pourcent_vitesse, int seconde_temps);
void handle_monter(int pourcent_vitesse, int seconde_temps);
void handle_descendre(int pourcent_vitesse, int seconde_temps);
void handle_gauche(int pourcent_vitesse, int seconde_temps);
void handle_droite(int pourcent_vitesse, int seconde_temps);
void handle_rotation_gauche(int pourcent_vitesse, int seconde_temps);
void handle_rotation_droite(int pourcent_vitesse, int seconde_temps);
void handle_pause(int seconde_temps);

/*****************************************
 *
 *             implementation :
 *
 *****************************************/

IHM_t *IHM_New (IHM_onInputEvent_t onInputEventCallback)
{
    int failed = 0;
    IHM_t *newIHM = NULL;
    
    // check parameters
    if (onInputEventCallback == NULL)
    {
        failed = 1;
    }
    
    if (!failed)
    {
        //  Initialize IHM
        newIHM = malloc(sizeof(IHM_t));
        if (newIHM != NULL)
        {
            newIHM->inputThread = NULL;
            newIHM->run = 1;
            newIHM->onInputEventCallback = onInputEventCallback;
            newIHM->customData = NULL;
        }
        else
        {
            failed = 1;
        }
    }
    
    if (!failed)
    {
        //start input thread
        if(ARSAL_Thread_Create(&(newIHM->inputThread), IHM_InputProcessing, newIHM) != 0)
        {
            failed = 1;
        }
    }
    
    if (failed)
    {
        IHM_Delete (&newIHM);
    }

    return  newIHM;
}

void IHM_Delete (IHM_t **ihm)
{
    //  Clean up

    if (ihm != NULL)
    {
        if ((*ihm) != NULL)
        {
            (*ihm)->run = 0;
            
            if ((*ihm)->inputThread != NULL)
            {
                ARSAL_Thread_Join((*ihm)->inputThread, NULL);
                ARSAL_Thread_Destroy(&((*ihm)->inputThread));
                (*ihm)->inputThread = NULL;
            }
            
            free (*ihm);
            (*ihm) = NULL;
        }
    }
}

void IHM_setCustomData(IHM_t *ihm, void *customData)
{
    if (ihm != NULL)
    {
        ihm->customData = customData;
    }
}

void *IHM_InputProcessing(void *data)
{
    IHM_t *ihm = (IHM_t *) data;
    int key = 0;
    char input_line_buffer[MAX_INPUT_LINE_SIZE+1];
    int command_code = 0;
    int pourcent_vitesse = 0;
    int seconde_temps = 0;
    int res = 0;

    if (ihm != NULL)
    {
        while (ihm->run)
        {
            if(fgets(input_line_buffer, MAX_INPUT_LINE_SIZE, stdin) == NULL) {
                fprintf(stderr, "Input error (fgets): %s\n", strerror(errno));
            }

            res = sscanf(input_line_buffer, "%d %d %d", &command_code, &pourcent_vitesse, &seconde_temps);
            if (res > 3 || res < 1) {
                fprintf(stderr, "Input error (sscanf): %s\n", strerror(errno));
            }

            switch(command_code)
            {
                case DECOLLER_INPUT_CODE:
                    handle_decoller();
                    break;

                case ATTERRIR_INPUT_CODE:
                    handle_atterrir();
                    break;

                case AVANCER_INPUT_CODE:
                    handle_avancer(pourcent_vitesse, seconde_temps);
                    break;

                case RECULER_INPUT_CODE:
                    handle_reculer(pourcent_vitesse, seconde_temps);
                    break;

                case MONTER_INPUT_CODE:
                    handle_monter(pourcent_vitesse, seconde_temps);
                    break;

                case DESCENDRE_INPUT_CODE:
                    handle_descendre(pourcent_vitesse, seconde_temps);
                    break;

                case GAUCHE_INPUT_CODE:
                    handle_gauche(pourcent_vitesse, seconde_temps);
                    break;

                case DROITE_INPUT_CODE:
                    handle_droite(pourcent_vitesse, seconde_temps);
                    break;

                case ROTATION_GAUCHE_INPUT_CODE:
                    handle_rotation_gauche(pourcent_vitesse, seconde_temps);
                    break;

                case ROTATION_DROITE_INPUT_CODE:
                    handle_rotation_droite(pourcent_vitesse, seconde_temps);
                    break;

                case PAUSE_INPUT_CODE:
                    handle_pause(seconde_temps);
                    break;

                default:
                    fprintf(stderr, "Unknown command code: %d\n", command_code);
                    break;
            }
                
            usleep(10);

        } // end while (ihm->run)
    }

    return NULL;
}

void IHM_PrintHeader(IHM_t *ihm, char *headerStr)
{
    if (ihm != NULL)
    {
        printf("%s\n", headerStr);
    }
}

void IHM_PrintInfo(IHM_t *ihm, char *infoStr)
{
    if (ihm != NULL)
    {
        printf("%s\n", infoStr);
    }
}

void IHM_PrintBattery(IHM_t *ihm, uint8_t percent)
{
    if (ihm != NULL)
    {
        printf("Remaining drone battery: %h%%\n", percent);
    }
}

/*****************************************
 *
 *             commandes :
 *
 *****************************************/

void handle_decoller()
{
    printf("Received decoller() from stdin\n");
}

void handle_atterrir()
{
    printf("Received atterrir() from stdin\n");
}

void handle_avancer(int pourcent_vitesse, int seconde_temps)
{
    printf("Received avancer(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_reculer(int pourcent_vitesse, int seconde_temps)
{
    printf("Received reculer(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_monter(int pourcent_vitesse, int seconde_temps)
{
    printf("Received monter(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_descendre(int pourcent_vitesse, int seconde_temps)
{
    printf("Received descendre(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_gauche(int pourcent_vitesse, int seconde_temps)
{
    printf("Received gauche(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_droite(int pourcent_vitesse, int seconde_temps)
{
    printf("Received droite(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_rotation_gauche(int pourcent_vitesse, int seconde_temps)
{
    printf("Received rotation_gauche(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_rotation_droite(int pourcent_vitesse, int seconde_temps)
{
    printf("Received rotation_droite(%d, %d) from stdin\n", pourcent_vitesse, seconde_temps);
}

void handle_pause(int seconde_temps)
{
    printf("Received pause(%d) from stdin\n", seconde_temps);
}