#include <stdlib.h>
#include <stdio.h>

void cubo_por_refencia(int *ap);
void modificar(int *variable);


int main()
{	

	int y=5;
	printf("\nEl valor de la variable es %d",y);
	cubo_por_refencia(&y); //Direccion de la variable
	printf("\nEl valor de la variable al cubo es %d",y);
	
	printf("\n\n/ ----------------------------------------- /\n\n");
	
	int i = 1;
	printf("i=%d antes de llamar a la funcion modificar",i);
	modificar(&i);
	printf("\ni=%d despues de llamar a la funcion modificar",i);

} 

void cubo_por_refencia(int *ap)
{
	*ap = (*ap)*(*ap)*(*ap);
}

void modificar(int *variable)
{
	printf("\nvariable = %d dentro de modificar",*variable);
	*variable=9;
	printf("\nvariable = %d dentro de modificar",*variable);
}


