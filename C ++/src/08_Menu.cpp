#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int op,numero;

    cout << "1. Cubo de un numero" << endl;
    cout << "2. Numero par o impar"<< endl;
    cout << "3. Salir"             << endl;

    cin >> op;

    switch (op)
    {
    case 1:
        cout << "Ingrese un numero: "; cin >> numero;
        numero = pow(numero,3);
        cout << "El cubo es: " <<numero;
        break;
    case 2:
        cout << "Ingrese un numero: "; cin >> numero;
        numero = numero%2;
        if (numero == 0)
            cout << "El numero es PAR";
        else
            cout << "El numero es IMPAR";
        break;
    case 3:
        exit(0);
        break;

    default:
        cout << "Error: Numero no valido";
        break;
    }

    return 0;
}
