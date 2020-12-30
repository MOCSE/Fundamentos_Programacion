#include <stdlib.h>
#include <stdio.h>

#include <string.h> //Libreria para cadenas

/*
	strlen() Funcion para saber la longitud de una cadena
	strcpy() Funcion copiar cadena a otra
	strcat() Funcion para concatenar cadenas
*/

#include <ctype.h>  //Libreria para trabajar con caracteres
/*
	isdigit() Funcion para comprobar si es un digito (Salida F o V)
	tolower() Funcion para convertir en minuscula
	toupper() Funcion para convertir en mayuscula
*/



int main()
{	
	//Sintaxix Arreglo Caracteres.
	
	char cad[5]; 
	char cad2[7]; 
	
	/* Representacion grafica de Arreglo de caracteres
		 	 0  1  2  3  4
		cad [h][o][l][a][ ]
	*/
	
	/* Representacion grafica de cadenas (Strings)
		 	 0  1  2  3  4
		cad [h][o][l][a][\0]
	*/
	
	//Asignar valores al arreglo
	cad[0] = 'h'; //en los caracteres se usa comillas simples para declarar valores
	cad[1] = 'o';
	cad[2] = 'l';
	cad[3] = 'a';
	cad[4] = '\0'; //Caracter nulo equivalente a 0 en ASCII
	
	//Impresion de arreglo de caracteres
	int i;
	for(i=0; i<4; i++)
		printf("%c",cad[i]); //%c se usa para caracteres y %s para cadenas
	printf("\n");
		
	//Asignar e impresion de valores para cadenas 
	
		//Scanf solo resive cadenas sin espacio o se MUERE  ):
		//gets (cad) - Lee cadenas
		//puts (cad) - Imprime cadenas
		
		//getchar() - Leer caracteres
		//fflush(stdin); - Limpia memoria para los ENTER por ejemple.
	
	/*
			  0  1  2  3  4  5  6  7
		cad2 [h][o][l][a][ ][t][u][\0]
	*/ 
	
	gets(cad2);
	puts(cad2);
	cad2[3] = '\0'; //Limitar cadenas
	puts(cad2);
	
	return 0;
	
	
}
