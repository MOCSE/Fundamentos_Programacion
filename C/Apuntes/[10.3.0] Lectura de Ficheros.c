#include <stdlib.h>
#include <stdio.h>


int main()
{	
	FILE *fichero; //Apuntador de alrchivo
	char texto[100]; //Texto a almacenar
	
	fichero = fopen("origen.txt","r"); //Abrir el archivo
	
	//Error al abrir el archivo
	if(fichero == NULL)
		printf("No se pudo abrir el archivo\n");
		
	printf("Contenido del fichero: \n");
	fgets(texto,100,fichero); //Lectura del archivo
	
	//Ciclo para imprimir caracteres/texto
	while(feof(fichero) == 0) {
		printf("%s",texto);
		fgets(texto,100,fichero);
	} fclose(fichero);
	
	//Error al cerrar el archivo
	if (fclose(fichero) == 0)
		printf("PROBLEMAS AL CERRAR EL FICHERO");
		
	return 0;
} 
