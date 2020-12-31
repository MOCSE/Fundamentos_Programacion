#include <iostream>
using namespace std;

int main()
{
    int tam,i;

    cout << "Introduce la cantidad de numeros a contar: " << endl; cin >> tam;
    int numeros[tam];

    for (i = 0; i < tam; i++){
        cout << "Introduce el numero " << i+1 <<": "; cin >> numeros[i];
    }
    
    for (i = 0; i < tam; i++)
        cout << "[" << i << "] = " << numeros[i] << endl;
    
    return 0;
}