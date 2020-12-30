#include <stdlib.h>
#include <stdio.h>

int main()
{	
	int matriz1[3][3];
	int matriz2[3][3];
	int matrizSuma[3][3];
	int i,j;
	
	//Se pide matriz 1
	printf("Ingrese la matriz numero 1\n"); 
	for(i=0; i<3; i++) 
		for(j=0; j<3; j++) 
		{
			printf("m1[%d][%d]= ",i,j);
			scanf("%d",&matriz1[i][j]);
		}
	system ("cls");
	
	//Se pide matriz 2
	printf("Ingrese la matriz numero 2\n");
	for(i=0; i<3; i++) 
		for(j=0; j<3; j++) 
		{
			printf("m2[%d][%d]= ",i,j);
			scanf("%d",&matriz2[i][j]);
		}
	system ("cls");
	
	//Se imprimen matrices
	printf("Las matrices ingresadas son: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
			printf("%d	",matriz1[i][j]);
			
		printf("\n"); 
	}
	
	printf("\n"); 
	
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
			printf("%d	",matriz2[i][j]);
			
		printf("\n"); 
	}
	
	
	//Suma de matrices
	printf("\n\nLa Suma de las matrices es: \n");
	for(i=0; i<3; i++) 
		for(j=0; j<3; j++) 
			matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
			
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
			printf("%d	",matrizSuma[i][j]);
			
		printf("\n"); 
	}
	
			
	return 0;
}
