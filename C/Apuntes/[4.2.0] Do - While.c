#include <stdio.h>
#include <stdlib.h>


int main()
{

	//While | Mientras
	
	/*Sintaxis
	
		while(expresion) //Se evalua tantas veces siempre que sea verdadera hasta que la expresion sea falsa
			enunciado;
			
	*/

		int x=1;
		
		while(x<5)
		{
			printf("x=%d\n",x);
			x++;
		}
		printf("\nDespues del While el valor de x=%d\n\n\n",x);
					
	
	//do ... while |
	
	/*Sintaxix
	
		do{	//Se ejecuta al menos una vez dentro del 'do' y se aplica la condicion del while
		enunciado;
		}while(expresion);
		
	*/
	int y=8;
	
	do{
		
		printf("y=%d\n",y);
		y++;
		
	} while (y<5);
}
