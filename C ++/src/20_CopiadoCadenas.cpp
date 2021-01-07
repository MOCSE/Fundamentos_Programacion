// Copiado de cadenas - Función strcpy()

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char cad[1000],cad_copiada[1000];

    cout << "Ingrese una cadena: ";  
    gets (cad); 

    strcpy(cad_copiada,cad);

    cout << "Cadena copiada: " << cad_copiada;

    return 0;
}