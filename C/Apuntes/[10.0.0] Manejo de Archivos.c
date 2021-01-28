#include <stdlib.h>
#include <stdio.h>



int main()
{	

int x=10; float y=20.5;
	
	//Flujos Estándar
		//De Entrada	stdin		Teclado
		//De Salida		stdout		Pantalla
		//De Error		stderr		Pantalla
		
	printf("El valor de x es %d\n",x); //Salida de flujo para pantalla
	scanf("%f",&y);					   //Entrada de flujo para pantalla
	
	//Entrada y salida con formato
		fprintf(stdout,"El valor de x es %d\n",x); //Salida de flujo especificado
		fscanf(stdin,"%f",&y);					   //Entrada de flujo especificado
	
	fprintf(ap,"El valor de x es %d\n",x); //Salida de flujo especificado a archivos
	fscanf(ap,"%f",&y);					   //Entrada de flujo especificado a archivos
	
	return 0;

} 




