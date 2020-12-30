#include <stdlib.h>
#include <stdio.h>


//Tipo de dato compuestos

int main()
{	

	//Definicion de la estrutura
	struct datos //Estructura - Etiqueta (Tipo de datos)
	{
		char c;
		int i;
		float f;
	};

	//Declaracion de estructura
	struct datos a,b;
	
	//Asignacion de variables
	a.c='v';
	a.i=25;
	a.f=1.2;
	
	b.c='w';
	b.i=33;
	b.f=2.3;
	
	//Asignacion de una estructura a otra
	a=b;
	
	//Estructuras anidadas
	struct coord{
		int x;
		int y;
	};
	
	struct coord2{
		struct coord uno;
		struct coord dos;
	};
	
	struct coord2 cuadro;
	struct coord ai;
	
	cuadro.uno.x=8;
	cuadro.uno.y=10;
	cuadro.dos.x=12;
	cuadro.dos.y=16;
	ai.x=22;
	ai.y=24;
	
	cuadro.dos=ai;
	
	//Estructuras con arreglos
	struct depo{
		char nombre[20]; //El nombre del arreglo es un apuntador al primer elemento del arreglo
		float s;
	};
	
	
	struct depo ard[3];
	int i;
	
	for(i=0;i<3;i++)
	{
		printf("Introduzca el nombre %d\n",i+1);
		gets(ard[i].nombre);
		printf("Introduzca el deposito %d\n",i+1);
		scanf("%f",&ard[i].s);
			fflush(stdin);
	}
	
	for(i=0;i<3;i++)
		printf("%s deposito %f\n",ard[i].nombre,ard[i].s);
	
		/*
		struct depo ard[3];
		ard[0].nombre = "Ana";
		ard[0].s	  = 500.0;
		ard[1].nombre = "Luis";
		ard[1].s	  = 800.0;
		ard[2].nombre = "Ana";
		ard[2].s	  = 100.0;
		*/
	
	//Estructuras con punteros
	struct apunt{
		int *apg;
		int *aph;
	};
	
	struct apunt ejem;
	
	int g,h;
	ejem.apg=&g;
	ejem.aph=&h;
	*ejem.apg=23;
	*ejem.aph=42;
	
	
	struct coord{
		int x;
		int y;
	};
	
	struct coord qubo;
	struct coord *apq;
	apq=&qubo;
	
	//Acceder a x de manera mas sencilla con punteros
	
	//(*apq).x=12;
	apq->x=12; //Operador de Flecha
	//(*apq).y=16;
	apq->y=16;
	

} 




