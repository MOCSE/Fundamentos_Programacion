//Metodo Burbuja

#include <iostream>

using namespace std;

int main()
{
    int numeros[] = {4,1,2,3,5};
    int i,j,aux;

    cout << "Ordenamiento Original: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];




        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if(numeros[j] > numeros[j+1])
                {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }




    cout << endl << "Ordenamiento Ascendente: ";
    for (i = 0; i < 5; i++)
        cout << numeros[i];

    cout << endl << "Ordenamiento Descendente: ";
    for (i = 4; i >= 0; i--)
        cout << numeros[i];
    

    return 0;
}
