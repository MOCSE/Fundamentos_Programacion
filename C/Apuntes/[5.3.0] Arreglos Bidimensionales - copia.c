#include <stdlib.h>
#include <stdio.h>

int main()
{	
	//Sintaxix Arreglo Bidimensionales.
	
	int m[3][4]; //[filas][Columnas]
	
	/* Representacion grafica en matriz
	
			[0]	[1]	[2]	[3]
		[0] [-]	[-]	[-]	[-]
		[1]	[-]	[-]	[-]	[-]
		[2]	[-]	[-]	[-]	[-]
		
	*/
	
	int i,j;
	
	//Lectura de arreglos Bidimensionales
	for(i=0; i<3; i++) //For para controlar filas (For externo)
		for(j=0; j<4; j++) //For para controlar columnas (For interno)
		{
			printf("m[%d][%d]= ",i,j);
			scanf("%d",&m[i][j]);
		}
		
	//Impresion de arreglos Bidimensionales en formato Matriz
	for(i=0; i<3; i++)
	{
		for(j=0; j<4; j++)
			printf("%d	",m[i][j]);
			
		printf("\n"); //Cambia de fila al acabar el for 'j' de las columnas
	}
	return 0;
}
