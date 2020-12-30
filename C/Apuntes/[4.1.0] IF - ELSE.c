#include <stdio.h>
#include <stdlib.h>

	
int main()
{
	
	//If | SI (Condicional)

		/* Sintaxix
		
			if(expresion) //Si el valor logico de la expresion es verdadero se ejecuta el enunciado, si es falso no se ejecuta.
				enunciado;
				
		*/
		
		int x=3,y=6;
		
		if(x>y) //Se ejecuta solo el primer printf si se cumple la condicion
			printf("x es mayor que y\n");
		printf("Adios\n");
	
		
		if(x>y) //Se ejecuta los 2 printf si se cumple la condicion
		{
			printf("x es mayor que y\n");
			printf("Adios\n");
		}
		
	//if ... else | Si ... solo no existe
		/*
			if(expresion) //Si se cumple la condicion a verdadero se ejcuta enunciado 1, si es falso se ejecuta el enuncidado 2
				enunciado 1;
			else
				enunciado 2;
		*/
		
		if(x>y)
			printf("x es mayor que y\n");
		else
			printf("x no es mayor que y\n");
	
	
	//If con Enunciado compuesto o bloque de enunciados
	
		/*Sintaxix
		
			if(expresion) //Se ejecuta todo lo del bloque "{}"
			{
				enunciado1;
				enunciado2;
				enunciadon;
			}
			else
			{
				enunciado4;
				enunciado5;
				enunciado6;
			}
			
		*/
	return 0;
}
