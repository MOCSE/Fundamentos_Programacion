#include <iostream>
#include <math.h>

using namespace std; 

void pedirDatos();
void al_cuadrado(float x);

float num; //Variables globales

int main()
{
    pedirDatos();
    al_cuadrado(num);

    return 0;
}

void pedirDatos(){
    cout << "Ingresa un numero para convertirlo al cuadrado: ";
    cin >> num;
}

void al_cuadrado(float x){
    x = pow(x,2);
    cout << "El cuadrado es: " << x;
}