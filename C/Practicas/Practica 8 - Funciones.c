//Romero Hernández Oscar David 1CM15 - Practica 8

#include <stdlib.h>
#include <stdio.h>
#include <math.h>

#define GRAVEDAD 9.8
#define PI 3.1416

float Periodo(float longitud);
float Frecuencia(float periodo);
float Velocidad_Maxima (float longitud, float elongacion);


int main()
{
	float periodo, frecuencia, velocidad_max, longitud, elongacion;
	
	printf("Ingresa la longitud de la cuerda: ");
	scanf("%f",&longitud);
	printf("Ingresa la elongacion: ");
	scanf("%f",&elongacion);
	
	periodo = Periodo(longitud);
	frecuencia = Frecuencia(periodo);
	velocidad_max = Velocidad_Maxima(longitud,elongacion);
	
	
	printf("\n\nPeriodo 	  = %f Seg\n",periodo);
	printf("Frecuencia  	  = %f Hz\n",frecuencia);
	printf("Velocidad Maxima  = %f m/s\n",velocidad_max);
	
	return 0;
}

float Periodo(float longitud)
{
	return 2*PI*(sqrt(longitud/GRAVEDAD));
}

float Frecuencia(float periodo)
{
	return 1/periodo;
}

float Velocidad_Maxima (float longitud, float elongacion)
{
	return elongacion*(sqrt(GRAVEDAD/longitud));
}






