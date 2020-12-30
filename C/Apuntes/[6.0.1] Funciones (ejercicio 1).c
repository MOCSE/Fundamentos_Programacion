//Escribir un programa que mediante una funcion imprima la tabla de multiplicar de un numero entero entre 1-10 que se introdusca por teclado y se reciva en la funcion principal (main)

#include <stdlib.h>
#include <stdio.h>

void Tabla_Multiplicar (int x);

int main()
{	
	int n;
	
	printf("Introduce un numero del 1-10: ");
	scanf("%d",&n);
	Tabla_Multiplicar(n);
	
	return 0;
}

void Tabla_Multiplicar (int x)
{
	int i,multi;
	for(i=1; i<=10; i++)
	{
		multi = i*x;
		printf("%d x %d = %d\n",x,i,multi);
	}
} 


