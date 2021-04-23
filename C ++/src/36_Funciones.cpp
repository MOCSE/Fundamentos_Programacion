//Sintaxix
/*
    tipo nombre(tipo var1,tipo var2,...,tipo varn){
        conjunto de intrucciones;
    }

    int numMax(int x, int y) //retorna numero entero
    double intercambio(double x, double y) //retorna numero doble
    void desplegar(float x,float y) //no retorna nada
*/

//Directivas del preprocesador
#include <iostream>
using namespace std;

//Prototipos de función
int encontrarMax(int x, int y);

//Conjunto de intrucciones;
int main()
{
    int n1,n2,mayor;

    cout << "Digite 2 numero" << endl;
    cin >> n1 >> n2;

    mayor = encontrarMax(n1,n2); //LLamamos a la funcion y Mandamos valores a la función

    cout << "Mayor: " << mayor;

    //Return valor
    return 0;
}

//Definición de funciones
int encontrarMax(int x, int y){
    int numMax;

    if(x>y)
        numMax = x;
    else
        numMax = y;

    return numMax;
}