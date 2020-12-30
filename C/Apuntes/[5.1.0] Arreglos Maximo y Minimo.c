#include <stdlib.h>
#include <stdio.h>

//#define TAM 10

int main()
{
	srand(time(NULL));
	
	int i, vmax, vmin,capacidad;
	
	//Capacidad del arreglo
	printf("Cuantos elementos tiene el arreglo?\n");
	scanf("%d",&capacidad); system("cls");
	int lista[capacidad];
	
	
	//Generar los numeros aleatorios
	for(i=0; i<capacidad; i++)
		lista[i] = rand(); //Numeros aleatorios, siempre son los mismos :)
		
		
	//Buscar valor minimo en el arreglo
	vmin = 2147483647;
	for(i=0; i<capacidad; i++)
		if(vmin > lista[i])
			vmin = lista[i];
	printf("El valor minimo generado es %d\n", vmin);
	
	
	//Buscar valor maximo en el arreglo
	vmax = 0;
	for(i=0; i<capacidad; i++)
		if(vmax < lista[i])
			vmax = lista[i];
	printf("El valor maximo generado es %d\n\n", vmax);
	
	
	//Imprimimos el arreglo
	for(i=0; i<capacidad; i++)
		printf("Arreglo[%d] = %d\n",i,lista[i]);
		
	return 0;
}
