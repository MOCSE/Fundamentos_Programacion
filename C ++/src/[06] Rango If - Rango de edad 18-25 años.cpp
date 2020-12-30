#include <iostream>

using namespace std;

int main()
{

    int edad=0;

    cout << "Ingrese su edad: " << endl; cin >> edad;

    if (edad>=18 && edad<=25)
        cout << "Esta en el rango de edad permitida" << endl;
    else
        cout << "No tiene la edad suficinete permitida" << endl;
    
    
    return 0;
}