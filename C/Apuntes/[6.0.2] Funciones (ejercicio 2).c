//Hacer una calculadora literal xd
#include <stdlib.h>
#include <stdio.h>
#include <math.h>

//Prototipos
float Suma (float x,float y);
float Resta (float x,float y);
float Multiplicacion (float x,float y);
float Division (float x,float y);
float Potencia (float x,float y);


int main()
{	
	float n1,n2,suma,rest,mult,divi,pote;
	int menu;
	
	printf("Elije una opcion: \n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Potencia\n6.-Salir\n\n");
	scanf("%d",&menu);
	
	system("cls");
	
	
	switch(menu)
	{
		case 1: 
			printf("Suma: \n"); 	
			printf("Numero 1: "); scanf("%f",&n1); 
			printf("Numero 2: "); scanf("%f",&n2);
			suma = Suma(n1,n2); 
			printf("%f + %f = %f",n1,n2,suma); 
			break;
		case 2: 
			printf("Restar: \n"); 	
			printf("Numero 1: "); scanf("%f",&n1); 
			printf("Numero 2: "); scanf("%f",&n2);
			rest = Resta(n1,n2); 
			printf("%f - %f = %f",n1,n2,rest); 
			break;
		case 3: 
			printf("Multiplicar: \n"); 	
			printf("Numero 1: "); scanf("%f",&n1); 
			printf("Numero 2: "); scanf("%f",&n2);
			mult = Multiplicacion(n1,n2); 
			printf("%f * %f = %f",n1,n2,mult); 
			break;
		case 4: 
			printf("Dividir: \n"); 	
			printf("Numero 1: "); scanf("%f",&n1); p
			rintf("Numero 2: "); scanf("%f",&n2);
			divi = Division(n1,n2); 
			printf("%f / %f = %f",n1,n2,divi);
			break;
		case 5: 
			printf("Potencia: \n"); 	
			printf("Numero 1: "); scanf("%f",&n1); 
			printf("Numero 2: "); scanf("%f",&n2);
			pote = Potencia(n1,n2); 
			printf("%f ^ %f = %f",n1,n2,pote); 
			break;
		case 6:
			
		
		
		default: printf("Error: Opcion no valida");
	}
	
	
	
	return 0; 
}


float Suma (float x,float y)
{
	float z;
	z = x + y;
	return z;
}

float Resta (float x,float y)
{
	float z;
	z = x - y;
	return z;
}

float Multiplicacion (float x,float y)
{
	float z;
	z = x * y;
	return z;
}

float Division (float x,float y)
{
	float z;
	z = x / y;
	return z;
}

float Potencia (float x,float y)
{
	float z;
	z = pow(x,y);
	return z;
}


