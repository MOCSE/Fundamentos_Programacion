#include <stdlib.h>
#include <stdio.h>


int main()
{
	//break | para la ejecucion y se usa en cualquier tipo de estructura de seleccion o repeticion
	
	
	int a=1;
	for(a==1; a<=5; a++)
	{
		if(a==3)
			break; //ya no se imprime el 1..2..3 y lo demas en adelante
		printf("a=%d\n",a);
	}
	
	//continue | salta lo que haya antes de el y lo ejecuta
	
	
	int b=2;
	for(a=1; a<=5; a++)
	{
		if(a%2==0)
			continue; //Se salta hasta aqui y continua
		printf("b=%d\n",b);
	}
	
	
	
	
	//switch | Combinacion de if...else - Principal uso: hacer un menu de opciones.
	
	char resp;
	printf("\nIntroduzca un numero entre 1 y 5: \n");
	scanf("%c",&resp);
	
	switch(resp)
	{
		
		//Case - Etiqueta con correspondencia a la condicion de Switch
		case ('a'): case('A'): printf("Introdujo la letra a/A"); break; //Case anidado
		case ('b'): printf("Introdujo la letra b"); break;
		case ('c'): printf("Introdujo la letra c"); break;
		case ('d'): printf("Introdujo la letra d"); break;
		case ('e'): printf("Introdujo la letra e"); break;
		
		default: printf("Numero invalido"); //En caso de que no encuentre ningun Case del switch se ejecutara el default
	}
	
	return 0;
}
