// Concatenado de cadenas - Función strcat()

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char cadena[] = "Hola que tal ";
    char nombre[100];
    char cadena_concatenada[150];

    cout << "Ingrese su nombre: ";
    cin.getline(nombre,100,'\n');
    
    //copiado de cadenas
    strcpy(cadena_concatenada,cadena);

    //Concatenado
    strcat(cadena_concatenada,nombre);

    cout << cadena_concatenada;

    return 0;
}