#include <stdio.h>
#include <stdlib.h>
#include <math.h> //Libreria 

//sqrt (x) [Raiz Cuadrada] == pow (x,0.5) [Para raices cubicas y asi]

	/*
	Libreria Math
	
	acos	arcocoseno
	asin	arcoseno
	atan	arcotangente
	atan2	arcotangente de dos par�metros
	floor	funci�n suelo
	cos		coseno
	cosh	coseno hiperb�lico
	exp(double x)	funci�n exponencial, computa e^x
	fabs	valor entero
	ceil	menor entero no menor que el par�metro
	fmod	residuo de la divisi�n de flotantes
	frexp	fracciona y eleva al cuadrado.
	ldexp	tama�o del exponente de un valor en punto flotante
	log		logaritmo natural
	log10	logaritmo en base 10
	modf	obtiene un valor en punto flotante �ntegro y en partes
	pow		eleva un valor dado a un exponente, x^y
	sin		seno
	sinh	seno hiperb�lico
	sqrt	ra�z cuadrada
	tan		tangente
	tanh	tangente hiperb�lica
	
	*/

#define PI 3.1416


//Escribir un programa para calcular el �rea de una circunferencia dado el valor del radio.
int main(){
	
	float radio,area; //**Buena practica variables en minuscula**
	
	printf("Introduzca el valor del radio: ");
	scanf("%f",&radio); //Recibir datos de la consola.
	
		area = (PI * (radio*radio)); //Forma *CHAFA*
		area = (PI * pow(radio,2));  //Forma "Buena" | pow(x,^) = exponente
		
	
	printf("El valor del area es: %f para un radio de %f \n",area,radio); //Concatenar datos de salida
	
	/*
	Secuencias de escape:
	\n	Salto de l�nea
	\b	Retroceso
	\t	Tabulaci�n horizontal
	\v	Tabulaci�n vertical
	\\	Contrabarra
	\f	Salto de p�gina
	\'	Ap�strofe
	\"	Comillas dobles
	\0	Fin de una cadena de caracteres		
	*/
	
		/*
		C�digo de formato
		%d  Tipo entero (int)
		%f  Tipo florante (flotante)
		%ld Tipo entero largo (long)
		%lf Tipo decimal doble precisi�n (double)
		%c  Tipo car�cter
		%s  Tipo cadena alfanum�rica (array de caracteres)
		%p  Punteros (Apuntadores)
		*/
	return 0;
}
