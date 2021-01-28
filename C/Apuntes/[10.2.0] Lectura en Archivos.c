#include <stdio.h>
#include <stdlib.h>

int main()
{
	int m[3],i; 
	FILE *ap; //Apuntador al archivo
	
	ap = fopen("texto2.txt", "r"); //Abrir y lee el archivo
	 
	//Error: 
	if(ap == NULL){
		printf("Error al abrir el archivo");
		exit(1);
	}
	
	for(i=0; i<3; i++)
		fscanf(ap, "%d", &m[i]);
		
	printf("Los datos son:\n");
	for(i=0; i<3; i++)
		printf("%d\n", m[i]);
			
	fclose(ap);

return 0;
}



