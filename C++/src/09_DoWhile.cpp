#include <iostream>

using namespace std;

int main()
{
    int number,contador=0;
    do
    {
        cout << "Introduce un numero: "; cin >> number;

        if (number > 0)
            contador++;
        

    } while (number != 0);

    cout << "Numero de Valores Mayores a 0 Leidos: " << contador;
    
}
