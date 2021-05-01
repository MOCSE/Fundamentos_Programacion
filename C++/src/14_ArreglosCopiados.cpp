#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

#define TAM 5 //Cuantos numeros vamos a desplegar :)

int main()
{
    srand(time(NULL));

    int i,numeros[TAM],numeros2[TAM];

    for (i = 0; i < TAM; i++)
        numeros[i] = 1+rand()%(101-1);

    for (i = 0; i < TAM; i++)
        cout << numeros[i] << "  ";

    cout << endl;

    for (i = 0; i < TAM; i++)
        numeros2[i] =  numeros[i] * 2;

    for (i = 0; i < TAM; i++)
        cout << numeros2[i] << "  ";
    
    return 0;
}