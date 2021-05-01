// Copiado de cadenas - Función strcmp()

/*
    0                   si ambas cadenas son idénticas (iguales)
    negativo            si el valor ASCII del primer carácter no coincidente es menor que el segundo.
    entero positivo     si el valor ASCII del primer carácter no coincidente es mayor que el segundo.
*/

#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char cad[1000],cad2[1000];

    cout << "Ingrese cadena1: ";  
    gets (cad); 
    cout << "Ingrese cadena2: ";  
    gets (cad2); 

    //Comparar cadenas
    if(strcmp(cad,cad2) == 0 )
        cout << "La cadena es igual" << endl;

    //Ver cual es mayor alfabeticamente
    if(strcmp(cad,cad2) > 0 )
        cout << "Mayor alfabeticamente: " << cad << "|" << cad2;
    
    return 0;
}