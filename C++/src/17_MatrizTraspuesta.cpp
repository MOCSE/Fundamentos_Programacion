#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

#define TAM 3 //Cuantos numeros vamos a desplegar :)

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
    cout << endl << endl; 

    //Se despliega matriz en forma de matriz
    cout << "Matriz:" << endl;
    for (i = 0; i < TAM; i++){
        for (j = 0; j < TAM; j++)
            cout << numeros[i][j] << "  ";
        cout << endl;
    }
    cout << endl << endl; 

    //Despligue de matriz Traspuesta
    cout << "Matriz Traspuesta:" << endl;
    for (j = 0; j < TAM; j++){
        for (i = 0; i < TAM; i++)
            cout << numeros[i][j] << "  ";
        cout << endl;
    }

    return 0;
}