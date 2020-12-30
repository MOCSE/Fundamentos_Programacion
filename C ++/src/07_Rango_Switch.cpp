#include <iostream>

using namespace std;

int main()
{

    int numero,Millares,Centenas,Decenas,Unidades;

    cout << "Ingrese un numero (1-3999): " << endl; cin >> numero;

    Millares = numero/1000;
    Centenas = ((numero) - (Millares*1000)) / 100;
    Decenas  = ((numero) - ((Millares*1000))-(Centenas*100)) / 10;
    Unidades = ((numero) - ((Millares*1000))-(Centenas*100)-(Decenas*10));

    if (numero>3999)
    {
        cout << "El Numero no es valido dentro del rango" <<endl;
        system("pause");
        exit(0);
    }

    else
    {
        cout << "El numero " << numero << " en notacion Romana es: ";

        switch (Millares)
        {
            case 1: cout << "M"; break;
            case 2: cout << "MM"; break;
            case 3: cout << "MMM"; break;
        }

        switch (Centenas)
        {
            case 1: cout << "C"; break;
            case 2: cout << "CC"; break;
            case 3: cout << "CCC"; break;
            case 4: cout << "CD"; break;
            case 5: cout << "D"; break;
            case 6: cout << "DC"; break;
            case 7: cout << "DCC"; break;
            case 8: cout << "DCCC"; break;
            case 9: cout << "CM"; break;
        }

        switch (Decenas)
        {
            case 1: cout << "X"; break;
            case 2: cout << "XX"; break;
            case 3: cout << "XXX"; break;
            case 4: cout << "XL"; break;
            case 5: cout << "L"; break;
            case 6: cout << "LX"; break;
            case 7: cout << "LXX"; break;
            case 8: cout << "LXXX"; break;
            case 9: cout << "XC"; break;
        }

        switch (Unidades)
        {
            case 1: cout << "I"; break;
            case 2: cout << "II"; break;
            case 3: cout << "III"; break;
            case 4: cout << "IV"; break;
            case 5: cout << "V"; break;
            case 6: cout << "VI"; break;
            case 7: cout << "VII"; break;
            case 8: cout << "VIII"; break;
            case 9: cout << "IX"; break;
        }

        cout <<""<<endl; system("pause");

    }

    return 0;
}