#include <stdlib.h>
#include <stdio.h>



int main()
{	

	//Estructuras con arreglos
	struct depo{
		char nombre[20]; //El nombre del arreglo es un apuntador al primer elemento del arreglo
		float s;
	};
	
	
	struct depo ard[3], *apdepo;
	apdepo=ard;
	
	int i;
	
	for(i=0;i<3;i++)
	{
		printf("Introduzca el nombre %d ",i+1);
		gets((ard+i)->nombre);
		printf("Introduzca el deposito %d ",i+1);
		scanf("%f",&((ard+i)->s));
			fflush(stdin);
	}
	
	for(i=0;i<3;i++)
		printf("%s deposito %f\n",(ard+i)->nombre,(ard+i)->s);
	
		/*
		apdepo -> nombre = "Ana";
		apdepo -> s=500.0;
		apdepo++;
		
		pdepo -> nombre = "Luis";
		apdepo -> s=800.0;
		apdepo++;
		*/
	

} 




