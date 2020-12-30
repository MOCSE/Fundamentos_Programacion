#include <stdio.h>
#include <stdlib.h>
#include <math.h> //Libreria 

//sqrt (x) [Raiz Cuadrada] == pow (x,0.5) [Para raices cubicas y asi]

	/*
	Libreria Math
	
	acos	arcocoseno
	asin	arcoseno
	atan	arcotangente
	atan2	arcotangente de dos parámetros
	floor	función suelo
	cos		coseno
	cosh	coseno hiperbólico
	exp(double x)	función exponencial, computa e^x
	fabs	valor entero
	ceil	menor entero no menor que el parámetro
	fmod	residuo de la división de flotantes
	frexp	fracciona y eleva al cuadrado.
	ldexp	tamaño del exponente de un valor en punto flotante
	log		logaritmo natural
	log10	logaritmo en base 10
	modf	obtiene un valor en punto flotante íntegro y en partes
	pow		eleva un valor dado a un exponente, x^y
	sin		seno
	sinh	seno hiperbólico
	sqrt	raíz cuadrada
	tan		tangente
	tanh	tangente hiperbólica
	
	*/

#define PI 3.1416


//Escribir un programa para calcular el área de una circunferencia dado el valor del radio.
int main(){
	
	float radio,area; //**Buena practica variables en minuscula**
	
	printf("Introduzca el valor del radio: ");
	scanf("%f",&radio); //Recibir datos de la consola.
	
		area = (PI * (radio*radio)); //Forma *CHAFA*
		area = (PI * pow(radio,2));  //Forma "Buena" | pow(x,^) = exponente
		
	
	printf("El valor del area es: %f para un radio de %f \n",area,radio); //Concatenar datos de salida
	
	/*
	Secuencias de escape:
	\n	Salto de línea
	\b	Retroceso
	\t	Tabulación horizontal
	\v	Tabulación vertical
	\\	Contrabarra
	\f	Salto de página
	\'	Apóstrofe
	\"	Comillas dobles
	\0	Fin de una cadena de caracteres		
	*/
	
		/*
		Código de formato
		%d  Tipo entero (int)
		%f  Tipo florante (flotante)
		%ld Tipo entero largo (long)
		%lf Tipo decimal doble precisión (double)
		%c  Tipo carácter
		%s  Tipo cadena alfanumérica (array de caracteres)
		%p  Punteros (Apuntadores)
		*/
	return 0;
}
