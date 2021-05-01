// Invertir una cadena - Función strrev()

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char palabra[100];
    char invertida[100];

    cout << "Ingrese una palabra: ";
    gets(palabra);

    strcpy(invertida,palabra);
    strrev(invertida);

    if(strcmp(palabra,invertida) == 0)
        cout << palabra << " | Es una palabra polindroma";
    else
        cout << palabra << " | " << invertida;

    return 0;
}