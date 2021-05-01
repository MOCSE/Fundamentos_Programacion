#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

#define TAM 10 //Cuantos numeros vamos a desplegar :)

int main()
{
    srand(time(NULL));

    int i,numeros[TAM],mayor;

    for (i = 0; i < TAM; i++)
        numeros[i] = 1+rand()%(101-1);

    for (i = 0; i < TAM; i++)
        cout << numeros[i] << "  ";

    cout << endl;
    mayor = numeros[0];

    for (i = 0; i < TAM; i++)
        if (numeros[i] > mayor)
            mayor = numeros[i];
        
    cout << "Numero mayor: " << mayor;
    
    return 0;
}