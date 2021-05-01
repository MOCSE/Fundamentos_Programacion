#include <iostream>
#include <math.h>

using namespace std; 

void pedirDatos();
void fraccion(double x, int y);

double num;
int num2;

int main()
{
    pedirDatos();
    fraccion(num,num2);

    return 0;
}

void pedirDatos(){
    cout << "Ingresa un numero con decimal para devolver su parte fraccionaria: ";
    cin >> num;

    num2 = num;
}

void fraccion(double x, int y){
    x = (y-x)*(-1);
    cout << "El numero fraccionario es: " << x;
}