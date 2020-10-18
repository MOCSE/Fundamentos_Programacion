#include <stdio.h>
#include <stdlib.h>

#define PI 3.1416; //Definir Constantes (MAYUSCULA).

main()
{
	
	//Constantes (MAYUSCULAS)
	const float EULER = 2.71828; //Definir Decimales Constantes.
	const int R = 25;	         //Definir Enteros Constantes.
	
	//Variables (minusculas)
	int z = 12;				     		 //Definir Enteros.
	char letra;				             //Definir Caracter.
	float decimal = 9.323454;		 	 //Definir Decimal sencillo (7 digitos).
	double decimal2 = 9.32123456432121;	 //Definir Decimal doble (15 digitos).
	
	//Operadores
		//Suma +
		//Resta -
		//Porducto *
		//Cociente /
		//Modulo % (100%3=1) - Residuo de division
	
	//Operadores relacionales
		//Mayor que >
		//Menor que <
		//Mayor o igual que >=
		//Menor o igual que <=
		//Igual que ==
		//Diferente de !=
		
			//Resultados Falso o Verdadero - 0 o 1
			
	//Operadores Logicos
		//And && (Binario)
		//Or  || (Binario)
		//Not !  (Unario)
		
	//Operadores Unarios
		//Not !
		//Incremento ++
			//Post incremento x++
			//Pre incremento ++x
		//Decremento --
			//Post Decremento x--
			//Pre Decremento --x
			
		//Ejemplo de Incremento
	printf("-------------------\n");
	printf("Ejemplo de Incremento\n");
	
		int x2 = 3;
		printf("x2 = %d \n",x2);
		x2++;
		printf("x2 (++) = %d \n",x2);
	
		//Ejemplo de Pre-Incremento
	printf("-------------------\n");
	printf("Ejemplo de Pre-Incremento\n");
		
		int x,y;
		x=3; y=x;
		printf("x=%d	y=%d\n",x,y);
		x=++y;
		printf("x=%d	y=%d\n",x,y);
	
	//Operador Ternario
		// ? : | op1?op2:op3
			//Si es verdadero el resultado es el op2
			//Si es falso se el resultado es el op3

			//Ejemplo Operador Ternario
			printf("-------------------\n");
			printf("Operador Ternario\n");
			
			int z2;
			z2=(2==3)?10:20;
			printf("z2 = %d",z2);
	
	
}


