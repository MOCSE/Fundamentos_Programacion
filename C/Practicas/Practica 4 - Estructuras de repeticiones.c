//Practica 4 - Romero Hernádez Oscar David

#include <stdio.h>
#include <stdlib.h>

#define PASSWORD 123


int main()
{
	
	int pass_user, numero,intentos=0;
	
	do
	{	
		
		if(intentos >= 3)
			{	
				system("cls"); //Limpia la consola
				printf("Se acabaron los intentos amigo ): \n");
				system("pause");
				exit(0); //Da cierre a la consola	
			}
		else
			intentos++;
			
		printf("Introduce el PASSWORD para ingresar: ");
		scanf("%i",&pass_user);	
		
	}while(PASSWORD != pass_user);
		{			
			system("cls");
			printf("Bienvenido!\n");
			do
			{
			printf("Introduce un numero entero entre el rango 2-25: ");
			scanf("%i",&numero);
			
			if(numero<2 || numero>25)
			{
				system("cls");
				printf("Error: El numero no esta dentro del rango\n");
			}
			
			}while(numero<2 || numero>25);
				{
					int i;
					
					system("cls");
					printf("%i ",numero);
					
					for(i=1; i<=numero; i++)
						printf("*");
				}
		}
		
	return 0;
}
