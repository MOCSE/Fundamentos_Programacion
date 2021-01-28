#include <stdlib.h>
#include <stdio.h>

int main()
{	
	int n, *ape, i;
	printf("Cuantos elementos tiene el arreglo? ");
	scanf("%d",&n);
	ape=(int*)malloc(sizeof(int)*n);
	
	if(ape == NULL)
	{
		printf("No se pudo asignar la memoria");
		exit(1);
	}
	
	for(i=0; i<n; i++)
	{
		printf("Elemento %d: ",i+1);
		scanf("%d",(ape+i));
	}
	
	for(i=0; i<n; i++)
		printf("Elemento %d= %d\n",i+1,*(ape+i));
		
	return 0;
} 




