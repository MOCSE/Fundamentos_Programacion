#include <stdlib.h>
#include <stdio.h>
#include <string.h>


//Romero Hernández Oscar David 1CM15 - Practica 7

int main()
{
	char cad[30],cad_mod[30];
	char c1,c2;
	int i;
	
	printf("Introduce una cadena de texto\n");
	gets(cad); //Leer cadena
	printf("\nIntroduce caracter 1: ");
	c1 = getchar();
	printf("Introduce caracter 2: ");
	fflush(stdin); c2 = getchar();
	
	strcpy(cad_mod,cad); //Copiamos la cadena
	
	for(i=0; i<31; i++)
		if(cad[i] == c1)
			cad_mod[i] = c2;
			
	printf("\n");
		
	printf("La cadena original es:		"); puts(cad); //Imprime cadena original
	printf("La cadena modificada es:	"); puts(cad_mod); //Imprime cadena modificada
	
	printf("\nSe sustituyo el caracter %c por %c",c1,c2); 
	
	
	return 0;
}
