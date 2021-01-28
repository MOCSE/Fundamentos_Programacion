// Conversion de cadena a numeros - Función atoi() & atof()

//atoi() - Enteros
//atof() - Flotantes

#include <iostream>
#include <string.h>
#include <stdlib.h> //Se necesita esta libreria

using namespace std;

int main()
{
    char entero[100];
    char decimal[100];
    float e,d,suma;

    cout << "Ingrese un numero entero: ";
    cin >> entero;
    cout << "Ingrese un numero decimal: ";
    cin >> decimal;

    e = atoi(entero);
    d = atof(decimal);

    suma = e + d;

    cout << "Suma = " << suma;

    return 0;   
}