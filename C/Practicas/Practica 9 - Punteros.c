//Romero Hernández Oscar David 1CM15 - Practica 9

#include <stdlib.h>
#include <stdio.h>

#define TAM 10

int main()
{
	int i;
	
	//Enteros
	int Arreglo_Int[TAM];
	int *apI, Indireccion_I;
	
	for(i=0; i<TAM; i++)
	{
		printf("Ingrese el valor ENTERO %d: ",i);
		scanf("%d",&Arreglo_Int[i]);
	} system("cls");
	
	//Flotantes
	float Arreglo_Flot[TAM];
	float *apF, Indireccion_F;
	
	for(i=0; i<TAM; i++)
	{
		printf("Ingrese el valor FLOTANTE %d: ",i);
		scanf("%f",&Arreglo_Flot[i]);
	} system("cls");
	
	//Dobles
	double Arreglo_Doble[TAM];
	double *apD, Indireccion_D;
	
	for(i=0; i<TAM; i++)
	{
		printf("Ingrese el valor DOBLE %d: ",i);
		scanf("%lf",&Arreglo_Doble[i]);
	} system("cls");
	
	//Caracter
	char Arreglo_char[TAM];
	int *apC, Indireccion_C;
	
	for(i=0; i<TAM; i++)
	{
		printf("Ingrese el valor CARACTER %d: ",i);
		fflush(stdin); Arreglo_char[i] = getchar();
	} system("cls");
	
	
	
	
	//Impresion de tabla enteros
	system("cls");
	printf("-Enteros-\nSubindice	Valor		Direccion de Memoria	Direccion de Memoria Hexadecimal\n");
	
		for(i=0; i<TAM; i++)
		{
			apI = &Arreglo_Int[i];
			Indireccion_I = *apI;
			printf("[%d]		%d		%d			%p\n",i,Indireccion_I,apI,apI);
		}
		
	//Impresion de tabla flotantes
	printf("\n\n-Flotantes-\nSubindice	Valor		Direccion de Memoria	Direccion de Memoria Hexadecimal\n");
	
		for(i=0; i<TAM; i++)
		{
			apF = &Arreglo_Flot[i];
			Indireccion_F = *apF;
			printf("[%d]		%f	%d			%p\n",i,Indireccion_F,apF,apF);
		}
		
	//Impresion de tabla Dobles
	printf("\n\n-Dobles-\nSubindice	Valor		Direccion de Memoria	Direccion de Memoria Hexadecimal\n");
	
		for(i=0; i<TAM; i++)
		{
			apD = &Arreglo_Doble[i];
			Indireccion_D = *apD;
			printf("[%d]		%lf	%d			%p\n",i,Indireccion_D,apD,apD);
		}
		
	//Impresion de tabla caracter
	printf("\n\n-Caracteres-\nSubindice	Valor		Direccion de Memoria	Direccion de Memoria Hexadecimal\n");
	
		for(i=0; i<TAM; i++)
		{
			apC = &Arreglo_char[i];
			Indireccion_C = *apC;
			printf("[%d]		%c		%d			%p\n",i,Indireccion_C,apC,apC);
		}
	return 0;
}





