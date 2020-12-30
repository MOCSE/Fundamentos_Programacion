#include <iostream>

using namespace std; 

int main()
{
    int n1,n2;

    cout << "Ingrese el numero:"; cin >> n1;

    n2= n1 % 2;

    if (n2 == 0)
        cout << "El numero es par" <<endl;
    else
        cout << "El numero es impar" <<endl;
    
    system("pause");

    return 0;
}