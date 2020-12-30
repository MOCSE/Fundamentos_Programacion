#include <stdio.h>
#include <stdlib.h>

main()
{
	printf("Practica 2 | Romero Hernandez Oscar David\n\n");
	
	//Expresión 1
	int x1=0;
	x1 = (17/2)+(3*5)-8;
	printf("1.- (17/2)+(3*5)-8 = %d \n",x1);
	
	//Expresión 2
	int x2=0;
	x2 = 23%3-16*6+14;
	printf("2.- 23%3-16*6+14 = %d \n",x2);
	
	//Expresión 3
	int x3=0;
	x3 = (12/14)+25-7*2-15;
	printf("3.- (12/14)+25-7*2-15 = %d \n",x3);
	
	//Expresión 4
	int x4=0;
	x4 = 2*19-(99%7)/5+11;
	printf("4.- 2*19-(99%7)/5+11 = %d \n",x4);
	
	//Expresión 5
	int x5=0;
	x5 = (2+6-8)/(15-8*7)+18;
	printf("5.- (2+6-8)/(15-8*7)+18 = %d \n",x5);
	
	//Expresión 6
	int x6=0;
	x6 = 32+9*4-56/(12*3-8);
	printf("6.- 32+9*4-56/(12*3-8) = %d \n\n",x6);
	
	//Expresion 7
	int x7=0, a=2, b=3, c=4;
	x7 = (a+b*c)-(b++/a)-(a%c);
	printf("    a=2, b=3 y c=4 \n",x7);
	printf("7.- (a+b*c)-(b++/a)-(a%%c) = %d \n\n",x7); //Para arreglar "%" en el printf se pone "%%"
	
	//Expresion 8
	int x8=0, x=1, y=3, z=5;
	x8 = ((x>=z)||(++y!=z))?(x+y+z):(z%y-x);
	printf("    x=1, y=3 y z=5 \n",x8);
	printf("8.- ((x>=z)||(++y!=z))?(x+y+z):(z%y-x) = %d \n",x8);
	
	
}
