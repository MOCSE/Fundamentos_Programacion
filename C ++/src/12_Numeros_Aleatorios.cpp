#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

#define TAM 10 //Cuantos numeros vamos a desplegar :)

int main()
{
    srand(time(NULL));

    int i,numeros[TAM];

    for (i = 0; i < TAM; i++)
        numeros[i] = 1+rand()%(101-1);

    for (i = 0; i < TAM; i++)
        cout << numeros[i] << "  ";
    
    return 0;
}