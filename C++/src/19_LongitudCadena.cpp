// Longitud de cadena - Función strlen()

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char cad[10];
    int tam;

    cout << "Ingrese una cadena (10 caracteres permitidos):";  
    gets (cad); 

    tam = strlen(cad);

    if (tam < 10)
        cout << "La cadena es: " << cad;
    else
        cout << "ERROR: Se paso la cantidad de caracteres permitidos | caracteres: " << tam;
    

    return 0;
}