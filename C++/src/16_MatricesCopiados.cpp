#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main()
{
    srand(time(NULL));

    int i,j,filas,columnas;

    //Se pide filas y columnas
    cout << "Filas: " << endl; cin >> filas;
    cout << "Columnas: " << endl; cin >> columnas;
    int numeros[filas][columnas],numeros_copia[filas][columnas];

    //Numeros Random
    for (i = 0; i < filas; i++)
        for (j = 0; j < columnas; j++)
            numeros[i][j] = 1+rand()%(101-1);

    //Despligue de matriz desordenada
    for (i = 0; i < filas; i++)
        for (j = 0; j < columnas; j++)
            cout << numeros[i][j] << "  ";

    //Copiado de matriz
    for (i = 0; i < filas; i++)
        for (j = 0; j < columnas; j++)
              numeros_copia[i][j] = numeros[i][j];

    //Salto de linea
    cout << endl << endl; 

    //Se despliega matriz copiada en forma de matriz
    for (i = 0; i < filas; i++){
        for (j = 0; j < columnas; j++)
            cout << numeros_copia[i][j] << "  ";
        cout << endl;
    }


    return 0;
}