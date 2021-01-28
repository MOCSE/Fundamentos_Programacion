#include <stdlib.h>
#include <stdio.h>
#include <math.h>

//Romero Hernández Oscar David 1CM15 - Practica 12

int main()
{	
	int n, i;
	float *ape,*ape2,promedio,desviacion;
	
	//n valores del conjunto
	printf("Introduce cuantos valores se van a ingresar: ");
	scanf("%d",&n);
	ape2 = ape = (float*) malloc(sizeof(float)*n);
	
	//Lectura de datos
	for(i=0; i<n; i++)
	{
		printf("Valor %d: ",i+1);
		scanf("%f",(ape+i));
		
		promedio += *(ape+i);
	}
	
	//Operacion de promedio
	promedio = promedio/n;
	
	//Operaciones de desviacion estandar	
	for(i=0; i<n; i++)
	{
		*(ape2+i) = pow((*(ape2+i)-promedio),2);
		desviacion += *(ape2+i);
	} 
		desviacion = sqrt(desviacion/4);
	
	
	//imprimir promedio y desviacion estandar
		printf("Promedio = %f\n",promedio);
		printf("Desviacion estandar: %f",desviacion);
		
	return 0;
} 
