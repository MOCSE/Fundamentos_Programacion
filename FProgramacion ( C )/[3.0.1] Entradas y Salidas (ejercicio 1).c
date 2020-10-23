#include <stdio.h>
#include <stdlib.h>


int main(){

	/*Escribir un programa para calcular la velocidad de un móvil dados los valores de la distancia en metros y el tiempo en segundos
	  Mostrar los resultados en m/s y en Km/h */
	  
	  float v_metros,v_kilometros,distancia,tiempo;
	  printf("Calcular la velocidad de un movil\n\n");
	  
	  printf("Introduzca la distancia (en metros): ");
	  scanf("%f",&distancia);
	  
	  printf("Introduzca el tiempo en segundos (en metros): ");
	  scanf("%f",&tiempo);
	  
		  v_metros = distancia/tiempo;
		  v_kilometros = ((distancia/1000) / (tiempo/3600));
	  
	  printf("La velocidad del movil es\nm/s = %f \nkm/h = %f",v_metros,v_kilometros);
	  
	return 0;
}
