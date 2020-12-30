#include <stdio.h>
#include <stdlib.h>
#include <math.h>

	/* Escribir un programa para calcular el volumen de una esfera dado el valor del radio
	   y tambien el volumen de un cilindro con el mismo valor de radio y dado ademas el valor
	   de la altura
	*/
	
#define PI 3.1416
	   
	   
int main(){
	
	float radio,altura,v_esfera,v_cilindro;
	
	printf("Introduce el valor del radio: ");
	scanf("%f",&radio);
	
	printf("Introduce el valor de la altura: ");
	scanf("%f",&altura);
	
		v_esfera = (4*PI*pow(radio,3) / 3);
		v_cilindro = ((PI*pow(radio,2))*altura);
		
	printf("\nEl volumen de la esfera es: %f \n",v_esfera);
	printf("El volumen del cilindro es: %f",v_cilindro);
	
	   
	return 0;
	
	
}

