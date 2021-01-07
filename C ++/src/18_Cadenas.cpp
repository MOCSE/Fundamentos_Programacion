#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char palabra [] = "Oscar";
    char palabra2[] = {'O','s','c','a','r'};
    char nombre[10];

    cout<<"Digita tu nombre: ";
    //cin >> nombre; Se muere con un espacio
    //gets(nombre);  Le vale kk el espacio de memoria asignado (No es seguro)
    
    cin.getline(nombre,10,'\n'); //Lo mejor para usar | cin.getline(variable,capacidad,bandera)
    cout << nombre;

    return 0;
}