#include <stdio.h>
#include <stdlib.h>


//Escribir un programa que imprima la tabla del codigo ASCII (sólo hasat el 127)



int main()
{

	int x,numero;
	
	for(x=1; x<=127; x++)
		printf("%d = %c\n",x,x);
		
	return 0;
}
