#include <stdlib.h>
#include <stdio.h>

int main()
{
	//Arreglos (Arrays) | Subindices para acceder al arreglo [0] [1] [2] [3] ... [n] (Inicia en 0 ¡SIEMPRE!)
	
	int c[3]; //Sintaxis de Arreglo | [] Capacidad del arreglo.
	
	//Asignacion de valores
	c[0] = 18;
	c[1] = 20;
	c[2] = 24;
	
	/* Equivalencias
		c[1+1] == c[2]
		
		int i=2;
		c[i] == c[2]
	*/
	
	//Guardar datos de arreglos;
	int x[4];
	int i=0,s=0;
	
	for(i=0; i<4; i++)
	{
		printf("Introduzca el valor de %d= ",i);
		scanf("%d",&x[i]);
	}
	
	
	//Imprimir datos del arreglo
	for(i=0; i<4; i++)
	{
		printf("x[%d]= %d\n",i,x[i]);
		s=s+x[i]; //Acumulador | Suma de todo el arreglo.
	}
	
	printf("El acumulador del arreglo es = %d",s);
		
	return 0;
}
