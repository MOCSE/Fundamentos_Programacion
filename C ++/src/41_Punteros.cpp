//Asignar a una variable puntero una dirección, y a su contenido un valor

#include <iostream>

using namespace std; 

int main()
{
    int var;    // define una variable entera var
    int *pun;   // define un puntero a un entero pun
    pun = &var; // asigna la dirección de var a pun
    *pun = 60;  // asigna al contenido de p 60


    cout << " &var. Direccion de var = " << &var << endl;
    cout << " pun.  Contenido de pun es la misma direccion de var "; cout << pun << endl;
    cout << " var.  Contenido de var = " << var << endl;
    cout << " *pun. El contenido de *pun es el mismo que el de var: "; cout << *pun << endl;

    return 0;
}