#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>


//Romero Hernández Oscar David 1CM15 - Practica 13

int main()
{	

	int i,opcion,n;
	FILE *ap; //Apuntador al archivo
do{

	//Menu
		printf("1) Enviar Palabras A Archivo\n");
		printf("2) Leer Palabras desde Archivo\n");
		scanf("%d",&opcion);

		if(opcion == 1){
			//n
			system("cls"); 
			printf("Escriba la cantidad de palabras a usar: \n"); 
			scanf("%d",&n); fflush(stdin);
			char z[n][100]; // n palabras | Longitud de las cadenas
			
			//Lectura de palabras 
			printf("Escriba %d palabras: \n",n);
				for(i=0; i<n; i++){
				printf("Palabra %d: ",i+1);
				gets(z[i]);
				fflush(stdin);
				}
				
			//Abrir archivo y genera el archivo de texto	
			ap = fopen("listado.txt","w"); 
				if(ap==NULL){ //Indicamos que no se pudo abrir el archivo
					printf("Error Al abrir el archivo");
					exit(1);
				} 
				
			//Impresion a archivo
			for(i=0; i<n; i++)
				fprintf(ap,"%s\n",z[i]);
			fclose(ap); //Cerramos el archivo
			
			printf("Se a guardado con exito las cadenas en el archivo de texto\n"); system("PAUSE"); system("cls"); 
		}
		
		if(opcion == 2){
			char letra;
			
			//Abrir y lee el archivo
			ap = fopen("listado.txt", "r"); 
			if(ap == NULL){ //Error
				printf("Error al abrir el archivo");
				exit(1);
			}
			
			while (!feof(ap))
	        {
	            char letra;
	            fscanf(ap, "%c", &letra);
	            if (letra == '\n')
	                printf(" ");
	            else
	                printf("%c", toupper(letra));
	        }
        	fclose(ap); //Cerramos el archivo
        	
        	printf("\n"); system("PAUSE"); system("cls"); 
		}
		
	}while(opcion==1 || opcion==2);
		exit(1);

	return 0;
}
