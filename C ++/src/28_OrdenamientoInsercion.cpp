//Metodo Inserción

#include <iostream>

using namespace std;

int main()
{
    int numeros[] = {4,1,2,3,5};
    int i,pos,aux;

    cout << "Ordenamiento Original: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];




        for (i = 0; i < 5; i++)
        {
            pos = i;
            aux = numeros[i];

            while ((pos>0) && (numeros[pos-1] > aux))
            {
                numeros[pos] = numeros[pos-1];
                pos--;
            }
            numeros[pos] = aux;
        }




    cout << endl << "Ordenamiento Ascendente: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];

    cout << endl << "Ordenamiento Descendente: ";
    for (i = 4; i >= 0; i--)
        cout << numeros[i];
    

    return 0;
}