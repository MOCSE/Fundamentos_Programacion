//Metodo Seleccion

#include <iostream>

using namespace std;

int main()
{
    int numeros[] = {4,1,2,3,5};
    int i,j,min,aux;

    cout << "Ordenamiento Original: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];




        for (i = 0; i < 5; i++)
        {
            min = i;
            for (j = i; j < 5; j++)
            {
                if (numeros[j] < numeros[min])
                {
                    min = j;
                }
                
            }
            aux = numeros[i];
            numeros[i] = numeros[min];
            numeros [min] = aux;
        }




    cout << endl << "Ordenamiento Ascendente: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];

    cout << endl << "Ordenamiento Descendente: ";
    for (i = 4; i >= 0; i--)
        cout << numeros[i];
    

    return 0;
}