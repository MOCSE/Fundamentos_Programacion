#include <stdlib.h>
#include <stdio.h>
#include <math.h>

//Romero Hernández Oscar David 1CM15 - Practica 5

int main()
{
	
	float numeros[4],desviacion[4];
	float promedio=0,sum_desviacion=0,desviacion_total;
	int i;
	

	//Leer arreglos
	for(i=0; i<5; i++)
	{
		printf("Introduce el valor %d: ",i+1);
		scanf("%f",&numeros[i]);
	}
	
	//Imprimir datos y operaciones para promedio
	printf("\n\nLos valores introducidos son: \n");
	for(i=0; i<5; i++)
	{
		printf("x[%d]= %f\n",i,numeros[i]);
		promedio = (promedio+numeros[i]); //Promedio sumatoria de datos
	}
		promedio = promedio/5; //Division del promedio
	
	//Operaciones de desviacion estandar	
	for(i=0; i<5; i++)
	{
		desviacion[i] = pow((numeros[i]-promedio),2);
		sum_desviacion += desviacion[i];
	} 
		desviacion_total = sqrt(sum_desviacion/4);
		
	printf("\nPromedio: %f\n",promedio);
	printf("Desviacion estandar: %f",desviacion_total);
	
	return 0;
}
