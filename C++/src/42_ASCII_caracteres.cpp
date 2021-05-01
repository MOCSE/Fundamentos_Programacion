//Escriba los números ASCII de los caracteres A, B, C, D, E, F

#include <iostream>

using namespace std; 

int main()
{
    char *punteroc; // un puntero a una variable carácter
    char caracter;
    punteroc = &caracter;

    cout << " ASCII caracter" << endl;
    for (caracter = 'A'; caracter <= 'F'; caracter++)
        cout << " "<< (int) caracter << " " << caracter << endl;

    return 0;
}