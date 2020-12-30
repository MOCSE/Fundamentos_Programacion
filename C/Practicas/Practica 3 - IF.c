#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
	Escribir un programa para calcular las soluciones de una ecuación de segundo grado. Debe considerar los tres posibles casos:
	-Soluciones reales e iguales
	-Soluciones reales y diferentes
	-Soluciones complejas
	En cualquiera de los tres casos se deben mostrar las soluciones.
*/

int main()
{

//Se redondeo a 2 decimales los resultados para que no se vea tan feo y aparatoso usando "%.2f"
	float a,b,c,discriminante,x1,x2;
	
	printf("Ingrese el valor de A: ");
	scanf("%f",&a);
	
	printf("Ingrese el valor de B: ");
	scanf("%f",&b);
	
	printf("Ingrese el valor de C: ");
	scanf("%f",&c);
	
		discriminante = ((pow(b,2) - (4*a*c)));
	
	if(discriminante == 0)
	{
		x1 = (-b / (2*a));
		
		printf("\nLa solucion es x = %.2f",x1);
	}
	
	if(discriminante > 0)
	{
		x1 = ((-b + sqrt(discriminante)) / (2*a));
		x2 = ((-b - sqrt(discriminante)) / (2*a));
		
		printf("\nLa solucion x1 = %.2f\n",x1);
		printf("La solucion x2 = %.2f\n",x2);
	}
	
	if(discriminante < 0)
	{
		float raiz,b_dividida;
		discriminante *= -1;
		
		b_dividida = -b / (2*a);
		raiz = ((sqrt(discriminante)) / (2*a));
		
		if(b_dividida == 0)
		{
			printf("\nLa solucion x1 = +%.2fi\n",raiz);
			printf("\nLa solucion x2 = -%.2fi\n",raiz);		
		}
		else
		{
			printf("\nLa solucion x1 = %.2f + %.2fi\n",b_dividida,raiz);
			printf("\nLa solucion x2 = %.2f - %.2fi\n",b_dividida,raiz);	
		}
	}
	
	return 0;
}
