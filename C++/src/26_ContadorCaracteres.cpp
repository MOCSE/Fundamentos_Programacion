#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char frase[100];
    int tam, i, A=0 , E=0, I=0, O=0, U=0;
    char caracter;

    cout << "Ingrese una frase: "; gets(frase);

    tam = strlen(frase);

    for (i = 0; i < tam; i++)
    {
        caracter = frase[i];

        switch (caracter)
        {
            case 'a': case 'A': A++; break;
            case 'e': case 'E': E++; break;
            case 'i': case 'I': I++; break;
            case 'o': case 'O': O++; break;
            case 'u': case 'U': U++; break;
        }
    }

    cout << "A = " << A << endl;
    cout << "E = " << E << endl;
    cout << "I = " << I << endl;
    cout << "O = " << O << endl;
    cout << "U = " << U << endl;

    return 0;
    
}