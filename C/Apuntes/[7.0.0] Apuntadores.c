#include <stdlib.h>
#include <stdio.h>

//Sirve para asignar un direccion de memoria.
//Las direcciones de memoria estan dadas en Hexadecimal, ej. 0FA , O2B , 001

int main()
{	

	int x=75, y=75;

	int * apx; //Declaracion de Apuntador/Punteros con "*"
	apx = &x;  // & (operador) - Direccion de...
	*apx = 85; //Declaracion de x por Indireccion
	
	int * apx2;
	apx2 = &y;
	
	printf("prueba Memoria 1: %d\n",apx);
	printf("prueba Valor   1: %d\n",x);
	printf("prueba Memoria 2: %d\n",apx2);
	printf("prueba Valor   2: %d\n\n\n\n",y);
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	
	int a, * apa;
	a=75;
	apa = &a;
	
	// Valor de A
	printf("Valor de a\n");
	printf("A    	  = %d\n",a);
	printf("Puntero-A = %d\n\n",*apa);
	
	// Direccion de memoria de A
	printf("Direccion de memoria\n");
	printf("A    	  = %d\n",&a);
	printf("Puntero-A = %d\n",apa);
	printf("Puntero   = %d\n\n",&apa);
	
	// Direccion de memoria en hexadecimal de A
	printf("Direccion de memoria en hexadeciaml\n");
	printf("A    	  = %p\n",&a);
	printf("Puntero-A = %p\n",apa); //%p Codigo de formato punteros
	printf("Puntero   = %p\n\n\n\n",&apa);
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	
	int *ape;
	int ar[3];
	
	ar[0] = 18;
	ar[1] = 24;
	ape =&ar[0]; //o bien se puede usar *ape=18; que equivale a ar[0]=18;
	ape = ar;
	
	ape++ //mover direccion dependiendo el tipo de dato (int = 4 bytes)
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	
	int **apapx,*apx,x;
	
	apx=&x;
	*apx=30; //x vale 30
	
	

} 



