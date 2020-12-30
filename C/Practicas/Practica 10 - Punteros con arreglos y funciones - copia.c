//Romero Hernández Oscar David 1CM15 - Practica 10

#include <stdlib.h>
#include <stdio.h>

#define TAM 20

void recibir(int *recibir);
void imprimir(int *imprimir);
void mayor_menor(int *numero);

int main()
{
	int arreglo[TAM];
		
	recibir(arreglo);
	imprimir(arreglo);
	mayor_menor(arreglo);
}

void recibir(int *recibir)
{
	int i;
	for(i=0; i<TAM; i++)
	{
		printf("Ingrese digito %d: ",i+1);
		scanf("%d",&*recibir);
		++recibir;
	}
}

void imprimir(int *imprimir)
{
	int i;
	printf("\nArreglo: ");
	for(i=0; i<TAM; i++)
	{
		printf("%d ",*imprimir);
		++imprimir;
	}
}

void mayor_menor(int *numero)
{
	int i,mayor=0,menor=*numero;
	for(i=0; i<TAM; i++)
	{
		if(*numero > mayor)
			mayor=*numero;
		if(*numero < menor)
			menor=*numero;
		
		++numero;
	}
	printf("\n\nNumero Mayor: %d",mayor);
	printf("\nNumero Menor: %d",menor);
}





