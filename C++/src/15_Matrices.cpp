#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

#define TAM 5 //Cuantos numeros vamos a desplegar :)

int main()
{
    srand(time(NULL));

    int i,j,numeros[TAM][TAM];

    //Numeros Random
    for (i = 0; i < TAM; i++)
        for (j = 0; j < TAM; j++)
            numeros[i][j] = 1+rand()%(101-1);

    //Despligue de matriz desordenada
    for (i = 0; i < TAM; i++)
        for (j = 0; j < TAM; j++)
            cout << numeros[i][j] << "  "; 

    //Salto de linea
    cout << endl << endl; 

    //Se despliega matriz en forma de matriz
    for (i = 0; i < TAM; i++){
        for (j = 0; j < TAM; j++)
            cout << numeros[i][j] << "  ";
        cout << endl;
    }

    //Diagonal de matriz
    cout << endl << "La diagonal es: ";
    for (i = 0; i < TAM; i++){
        for (i = 0; i < TAM; i++)
            cout << numeros[i][i] << "  ";
        cout << endl;
    }

    return 0;
}