#include <stdlib.h>
#include <stdio.h>

void cs(char*ptrS);


int main()
{	

	char cadena[] = "La Escuela Superior de Computo";
	printf("La cadena antes:   %s",cadena);
	cs(cadena);
	printf("\n\nLa cadena despues: %s\n",cadena);
	
} 

void cs(char*ptrS)
{
	while(*ptrS!='\0')
	{
		if(islower(*ptrS))
		{
			*ptrS = toupper(*ptrS);
		}
		++ptrS;
	}
}



