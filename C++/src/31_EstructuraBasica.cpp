#include <iostream>

using namespace std;

struct Persona
{
    char nombre[20];
    int edad;
}
persona1 = {"Oscar",18},
persona2 = {"David",20},
persona3;

int main()
{
    //como llamar a una estructura

    cout << "Nombre1: "<<persona1.nombre << endl;
    cout << "Edad1: "<<persona1.edad << endl;
    cout << "Nombre2: "<<persona2.nombre << endl;
    cout << "Edad2: "<<persona2.edad << endl;

    cout << "- - - -" << endl;

    cout << "Nombre: ";
    cin.getline(persona1.nombre,20,'\n');
    cout << "Edad: ";
    cin >> persona1.edad;

    cout << "\nImprimiendo datos\n";
    cout << "Nombre: " << persona1.nombre << endl;
    cout << "Edad: " << persona1.edad << endl;

    return 0;
}
