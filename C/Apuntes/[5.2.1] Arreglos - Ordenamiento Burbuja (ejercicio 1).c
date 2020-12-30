#include <stdlib.h>
#include <stdio.h>
#include <time.h> //Libreria para tiempo al usar el random.

#define TAM 10

int main()
{	
	srand(time(NULL)); //Funcion para generar numeros aleatorios respecto al tiempo actual
	
	int i,pasada,aux,array[TAM];
	
	//Se genera 10 arreglos porque que hueva poner todos a mano
	for(i=0; i<TAM; i++)
		array[i] = rand();
	
	//Se imprime el arreglo introducido
	printf("\nArreglo generado:\n");
	for(i=0; i<TAM; i++)
		printf("%d	",array[i]);
	printf("\n");


	//Separacion de datos en Pares primero e Impares despues.
	for(pasada=0; pasada<=TAM-1; pasada++) 
		for(i=0; i<=TAM-2; i++)
			if(array[i] % 2 == 1) 
			{
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;	
			}
		printf("\nSeparacion de datos Pares|Impares:\n");
		for(i=0; i<TAM; i++)
			printf("%d	",array[i]);
		printf("\n");
		
	//Se ordena de menor a mayor con los numero pares & de mayor a menor con los numeros impares
	for(pasada=0; pasada<=TAM-1; pasada++) 
		for(i=0; i<=TAM-2; i++)
		{
			if(array[i] > array[i+1]) 
			{
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;	
			}
			if(array[i] % 2 == 1) 
			{
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;	
			}
		}
		printf("\nSeparacion de datos Pares en orden Creciente | Impares en orden Decreciente\n");
		for(i=0; i<TAM; i++)
			printf("%d	",array[i]);
		printf("\n");
		
		
		
		
	return 0;
}

