//Romero Hernández Oscar David 1CM15 - Practica 11

#include <stdlib.h>
#include <stdio.h>

struct agenda{
		char nombres   [30];
		char apellidos [30];
		char direccion [50];
		char telefono  [16];
		char facebook  [40];
	};

int main()
{
	int TAM, i;
	
	printf("Numero de registros a almacenar: ");
	scanf("%d",&TAM);
	system("cls");
	
	
	struct agenda ard[TAM], *ap_agenda;
	ap_agenda = ard;
	
	
	for(i=0;i<TAM;i++)
	{
		printf("Registro numero %d\n- - - - - - - - -\n",i+1); 
		fflush(stdin);
		
		printf("Introduzca Nombre: ");
		gets((ard+i)->nombres); fflush(stdin);
		
		printf("Introduzca su Apellido: ");
		gets((ard+i)->apellidos); fflush(stdin);
		
		printf("Introduzca su Direccion: ");
		gets((ard+i)->direccion); fflush(stdin);
		
		printf("Introduzca su Telefono: ");
		gets((ard+i)->telefono); fflush(stdin);
		
		printf("Introduzca su Facebook: ");
		gets((ard+i)->facebook); fflush(stdin);
		
		system("cls");
	}
	
	for(i=0;i<TAM;i++)
	{
		printf("Registro numero %d\n- - - - - - - - -\n",i+1);
			printf("Nombre	    %s\n",(ard+i)->nombres);
			printf("Apellido    %s\n",(ard+i)->apellidos);
			printf("Direccion   %s\n",(ard+i)->direccion);
			printf("Telefono    %s\n",(ard+i)->telefono);
			printf("Facebook    %s\n",(ard+i)->facebook);
		printf("- - - - - - - - - - - - - - - -\n",i+1);
	}
		
	
}




