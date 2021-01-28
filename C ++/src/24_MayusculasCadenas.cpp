// Invertir una cadena - Función strupr() & strlwr()

//strupr() - Minusculas -> Mayusculas
//strlwr() - Mayusculas -> Minusculas

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char min[] = "hola como estan?";
    char may[] = "HOLA COMO ESTAN?";

    if(strcmp(min,may) == 0 )
        cout << "La cadena es igual" << endl;
    else
        cout << "La cadena es diferente" << endl << endl;

    strupr(min);

    if(strcmp(min,may) == 0 )
        cout << "La cadena es igual" << endl;
    else
        cout << "La cadena es diferente" << endl << endl;

    return 0;
    
}