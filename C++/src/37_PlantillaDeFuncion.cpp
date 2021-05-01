#include <iostream>

using namespace std;

//Funcion para usar cualquier tipo de dato
template <class TIPOD>
void mostrarABS(TIPOD numero);

int main()
{
    int num1 = 4;
    float num2 = 56.67;
    double num3 = -123.5678;

    mostrarABS(num1);
    mostrarABS(num2);
    mostrarABS(num3);

    return 0;
}

template <class TIPOD>
void mostrarABS(TIPOD numero){
    if (numero<0)
        numero = numero * -1;

    cout << "El valor absoluto del numero es: " << numero << endl;
}