#include <stdlib.h>
#include <stdio.h>


//Tipo de dato compuestos

int main()
{	
	//Memoria Estatica
		int x;
		char nombre[10];
		
	//Memoria Dinamica | Para borrar memoria si se quiere usar otra
		//Memoria dinamica para almacenar 1 enteros
		int *ape;
		ape = (int *) malloc(sizeof(int)*1);
		*ape=32;
		printf("%d \n,*ape);
		free(ape); //Se libera el espacio de memoria
		
		
		//Memoria dinamica para almacenar 3 flotantes
		float *apf;
		apf = (float *) malloc(sizeof(float)*3);
		*apf=2.5;
		*(apf+1)=4.8;
		*(apf+2)=6.1;
		free(apf2);
		
	return 0;

} 




