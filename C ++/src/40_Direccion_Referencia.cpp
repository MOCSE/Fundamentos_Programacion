//Obtener el valor y la dirección de una variable y una referencia

#include <iostream>

using namespace std; 

int main()
{
    int Variable = 75; // Declaración de variable
    int& Referencia = Variable; //Referencia e inicialización

    cout << " Contenido de Variable = "     << Variable << endl;
    cout << " Direccion &Variable = "       << &Variable << endl;
    cout << " Contenido de Referencia = "   << Referencia << endl;
    cout << " Direccion &Referencia = "     << &Referencia << endl;

    return 0;
}