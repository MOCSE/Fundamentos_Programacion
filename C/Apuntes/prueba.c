#include <stdlib.h>
#include <stdio.h>

//Romero Hernández Oscar David 1CM15 - Practica 13

int main()
{	
	char z[3][300]; // n palabras | longitud de la cadena
	int i;
	FILE *ap; //Apuntador al archivo
	
	printf("Escriba 3 palabras: \n");
	for(i=0; i<3; i++){
		printf("Palabra %d: ",i+1);
		gets(z[i]);
		fflush(stdin);
	}
	
	//Impresion a pantalla
	printf("Los datos son:\n");
	for(i=0; i<3; i++)
		printf("%s\n",z[i]);
	

	return 0;
} 
