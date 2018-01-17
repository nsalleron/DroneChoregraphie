#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>

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

int main(int argc, char const *argv[])
{
	char input_line_buffer[MAX_INPUT_LINE_SIZE+1];
    int command_code = 0;
    int pourcent_vitesse = 0;
    int seconde_temps = 0;
    int res = 0;

	while(1) {

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

	}
	return 0;
}