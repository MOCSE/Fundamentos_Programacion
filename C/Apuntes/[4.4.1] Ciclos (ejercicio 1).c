#include <stdio.h>
#include <stdlib.h>

//Escribir un programa que imprima en pantalla la siguente secuencia 110, 99, 88, 77, 66...11,0

int main()
{
	int x;
	
	for(x=110; x>=0; x-=11)
		printf("x=%d\n",x);
		
}
