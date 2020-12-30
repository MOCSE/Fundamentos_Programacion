#include <stdio.h>
#include <stdlib.h>

//Escribir un programa que imprima una tabla como la que se muestra a continuacion

/* 
	n	n*10	n*100	n*1000
	1	10		100		1000
	2	20		200		2000
	..	...		...		...
	10	100		1000	10000
*/

int main()
{

	int x,y,z;
	
	printf("n	n*10	n*100	n*1000\n\n");
	
	for (y=1; y<=10; y++)
	{
		
		for (x=1; x<=1000; x*=10)
		{
			z= y*x;
			printf("%d	",z);
			
		}
		printf("\n");
		
	}
	
	
	return 0;
}
