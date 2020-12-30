#include <stdlib.h>
#include <stdio.h>

#define TAM 10

//Ordenamiento Burbuja
int main()
{
	
	int array[TAM] = {2,6,4,8,10,12,89,68,45,37}; //No es necesario especificar el tamaño del arreglo en un conjunto de valores, aunque puede ser especificado...
	int i, pasada, aux;
	
	//Impresion de datos originales
	printf("Los datos en el orden original son: \n");
	for(i=0; i<TAM; i++)
		printf("%4d",array[i]); //Espacios para imprimir los enteros como tabulacion.
	printf("\n");
	
	
	for(pasada=1; pasada<=TAM-1; pasada++) //Pasada, detecta la cantidad de veces dependiendo el numero de arreglos que se hara el ciclo
		for(i=0; i<=TAM-2; i++)
			if(array[i] > array[i+1]) //Orden del orden (Literal JAJAJA)
			{
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;
			}
	
	//Impresion del nuevo orden
	printf("Los datos en orden creciente son: \n");
	for(i=0; i<=TAM-1; i++)
		printf("%4d",array[i]);
	printf("\n");
	
	return 0;
}
