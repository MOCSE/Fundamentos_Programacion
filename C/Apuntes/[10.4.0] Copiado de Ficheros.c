#include <stdlib.h>
#include <stdio.h>


int main()
{	
	FILE *origen,*destino; //Apuntador de alrchivo
	char letra //Texto a almacenar
	
	fichero = fopen("origen.txt","r"); //Abrir el archivo
	destino = fopen("destino.txt","w"); //Escribir en el archivo
	
	//Error al abrir el archivo
	if(fichero == NULL || destino == NULL)
		printf("No se pudo abrir algun archivo\n");
		
	letra = getc(origen); //Lectura del archivo a origen
	
	//Ciclo para copiado e imprimir caracteres/texto
	while(feof(fichero) == 0) {
		puts(texto,destino);
		printf("%s",texto);
		fgets(texto,100,destino);
	} fclose(fichero);
	
	//Error al cerrar el archivo
	if (fclose(fichero) == 0)
		printf("PROBLEMAS AL CERRAR EL FICHERO");
		
	return 0;
} 
