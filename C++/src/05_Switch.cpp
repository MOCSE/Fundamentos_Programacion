#include <iostream>

using namespace std; 

int main()
{
    char letra;

    cout << "Ingrese una vocal" << endl; cin >> letra;

    switch (letra)
    {
        case 'a' :
        case 'e' : 
        case 'i' : 
        case 'o' : 
        case 'u' : cout << "Es una vocal minuscula"; break;

        case 'A' :
        case 'E' :
        case 'I' :
        case 'O' :
        case 'U' : cout << "Es una vocal MAYUSCULA"; break;
    
        default: cout << "ESA NO ES UNA VOCAL"; break;
    }

    return 0;
}