/*
    Algoritmo Busqueda Lineal
    Este algoritmo busca un elemento en un conjunto de n elementos un arreglo
    24/Marzo/2021
    Lenguaje C++ | v1.0
    Romero Hernández Oscar David
*/

#include <iostream> //Libreria de entrada y salida de datos

using namespace std; //Estandar de c++ | Flujos de entrada y salida rapidos
int BusquedaLineal(int valor,int A[],int n); //Prototipo de la función

int main()
{
    int array[] = {100,20,30,10,109,2,4,6,43,23}; //Arreglo de n numeros || n=10
    int n = sizeof(array) / sizeof(int); //Se calcula en n elementos del arreglo
    int resultado, valor; //Asignacion de variables

    cout << "Ingrese un numero entero a buscar: "; //Se pide el elemento a buscar
    cin >> valor;

    resultado = BusquedaLineal(valor,array,n); //Se llama a la funcion de busqueda

    //Comparacion si el valor buscado se encontro y en que posicion
    if (resultado == n+1)
        cout << "No se encontro el valor buscado";
    else
    {
        cout << "Arreglo = ";
        for (int i = 0; i < n; i++)
            cout << array[i] << "-";
        cout << endl << "Se encontro el valor ingresado en " 
             << "la posicion del arreglo numero: " << resultado << endl;
    }

}

//Codigo Fuente
int BusquedaLineal(int valor,int A[],int n) //Funcion Busqueda Lineal
{
    int i=0; 

    while(i<=n && A[i]!=valor)
        i=i+1;

    return i;
}

