#include <stdlib.h>
#include <stdio.h>
#include <time.h> //Libreria para tiempo al usar el random.


#define TAM 5

//Romero Hernández Oscar David 1CM15 - Practica 6

int main()
{
	srand(time(NULL)); //Funcion para generar numeros aleatorios respecto al tiempo actual
	printf("Matriz 5x5\n\n");
	
	int matriz[TAM][TAM];
	int i,j,n_max,n_min;
	int c_max,c_min,f_max,f_min;
	
	//Generacion de Numeros aleatorios
	for(i=0; i<TAM; i++)
		for(j=0; j<TAM; j++)
			matriz[i][j] = 1+rand()%(101-1); //Generacion de numeros entre 1 y 100
	
	//Buscar el valor minimo y maximo del arreglo
	n_min=1000; n_max=0;
	for(i=0; i<TAM; i++)
		for(j=0; j<TAM; j++)
			{
				if(matriz[i][j] < n_min) //Valor minimo
				{
					n_min = matriz[i][j];
					f_min = i; c_min = j; //Posicion del arreglo minimo
				}
				if(matriz[i][j] > n_max) //Valor Maximo
				{
					n_max = matriz[i][j];
					f_max = i; c_max = j; //Posicion del arreglo maximo
				}
			}
	
	//Impresion de arreglos Bidimensionales en formato Matriz
	for(i=0; i<TAM; i++)
	{
		for(j=0; j<TAM; j++)
			printf("%d	",matriz[i][j]);
			
		printf("\n"); 
	}
	
	//Impresion de datos
	printf("\n\n Numero Menor: %d ",n_min); printf("    Posicion Matriz[%d][%d]",f_min,c_min);
	printf("\n\n Numero Mayor: %d",n_max);  printf("    Posicion Matriz[%d][%d]",f_max,c_max);
	
	return 0;
}
