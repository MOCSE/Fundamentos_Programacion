#include <stdlib.h>
#include <stdio.h>
#include <math.h>

#define PI 3.1416

//Prototipos Declaracion de funciones 
float perimetro (float x);
float area(float y);
void volumen_esfera (float z);
void volumen_cilindro (float w, float altura);


int main()
{	
	float r,p,a,h,vc;
	printf("Introduce el valor del radio: ");
	scanf("%f",&r);
	printf("Introduce el valor de la altura: ");
	scanf("%f",&h);
	
	//Mandamos a llamar a la funcion y mandamos que el valor correspondiente dentro de los parentesis
	p = perimetro(r);
	printf("Perimetro: %f\n",p);
	a = area(r);
	printf("Area: 	   %f\n",a);
	volumen_esfera(r);
	volumen_cilindro(r,h);
	
	return 0;
}

	//Funcion (Solo puede devolver un valor pero recibe n valores) 
	float perimetro (float x) // Tipo de retorno - Nombre de la funcion (Datos que va a recibir la funcion)
	{
		float per;
		per = 2.0*PI*x;
		return per; //Devuelve un valor
	}
	
	//Funcion simplificada
	float area(float y)
	{
		return PI*pow(y,2.0);
	}
	
	//Funcion que no devuelve nada
	void volumen_esfera (float z)
	{
		float ve;
		ve = (4.0/3.0)*PI*pow(z,3.0);
		printf("Voluemen Esfera:  %f\n",ve);
	}
	
	//Funcion con 2 valores de entrada y funcion dentro de funciones
	void volumen_cilindro (float w, float altura)
	{
		float v;
		v = area(w)*altura; //Se puede usar una funcion dentro de otra funcion sim problemas
		printf("Voluemen Esfera:  %f\n",v);
	}
