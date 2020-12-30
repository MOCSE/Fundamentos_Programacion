#include <stdlib.h>
#include <stdio.h>


int main()
{
	int x,y,i,j;
	
	scanf("%d",&x);
	scanf("%d",&y);
	printf("x=%d, y=%d\n",x,y);
	
	for(i=0; i<=x; i++) //piramide a la mitad
	{
		for(j=0; j<i; j++)
			printf("*");
	printf("\n");
	}
	
	
	return 0;
}
