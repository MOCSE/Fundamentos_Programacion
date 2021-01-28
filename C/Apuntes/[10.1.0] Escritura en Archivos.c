#include <stdlib.h>
#include <stdio.h>


int main()
{	
	int z[3],i;
	FILE *ap; //Apuntador al archivo
	
	printf("Escriba 3 datos de tipo entero: \n");
	for(i=0; i<3; i++)
		scanf("%d",&z[i]);
	
	
	ap = fopen("texto.txt","w"); //Abrir archivo y genera el archivo de texto
	
	//Modos de apertura (Se crean los archivos)
		//r - Leer el archivo
		//w - Escribir en un archivo
		//a - Añadir
		
	if(ap==NULL) //Indicamos que no se pudo abrir el archivo
	{
		printf("Error Al abrir el archivo");
		exit(1);
	}
	
	//Impresion a pantalla
	printf("Los datos son:\n");
	for(i=0; i<3; i++)
		printf("%d\n",z[i]);
	
	//Impresion a archivo
	fprintf(ap,"Los datos son:\n");
	for(i=0; i<3; i++)
		fprintf(ap,"%d\n",z[i]);
		
	fclose(ap); //Cerramos el archivo
	
	return 0;
} 




