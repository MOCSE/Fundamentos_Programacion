#include <iostream>

using namespace std; 

int main()
{
    int n1;

    cout << "Ingrese el numero:"; cin >> n1;

    if (n1 > 0)
        cout << "El numero es Positivo" <<endl;
    else
        cout << "El numero es Negativo" <<endl;
    
    system("pause");

    return 0;
}