//Es una funcion que se llama a si misma

#include <stdlib.h>
#include <stdio.h>


int potencia(int a, int b);

int main()
{	
	int a,b,p;
	printf("Introduzca el valor a (base): ");
	scanf("%d",&a);
	printf("Introduzca el valor b (exponente): ");
	scanf("%d",&b);
	
	p = potencia(a,b);
	printf("El resultados es %d\n",p);
	
} 

int potencia(int a, int b)
{
	if(b==1)
		return a;
	else
		return a*potencia(a, b-1);
}


