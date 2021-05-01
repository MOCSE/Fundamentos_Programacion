/*
    Algoritmo Ordenamiento por Seleccion
    Este algoritmo busca ordenar los elementos en un conjunto de 
        n numeros en un arreglo del menor a mayor
    29/Marzo/2021
    Lenguaje C++ | v1.0
    Romero Hernández Oscar David
*/

//Librerias
#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std; //Estandar de c++ | Flujos de entrada y salida rapidos

//Prototipos de las funciones
void OrdenamientoSeleccion(int A[],int n);

int main()
{
    //Se pide el número de enteros a ordenar
    int n;
    cout << "Numero de elementos a ordenar: ";
    cin >> n;
    int array[n]; //Arreglo de n numeros

    //Genera n numeros aleatorios (de 1 a 1000)
    srand(time(NULL));
    int i,numeros[n];
    for (i=0; i < n; i++)
        array[i] = 1+rand()%(1001-1);

    //Se imprime el n numeros generados
    cout << endl << "Arreglo Original: " << endl;
    for(int i=0; i < n; i++)
        cout << array[i] << " ";

    //Se ordena e imprime los n numeros
    OrdenamientoSeleccion(array,n);

    return 0;
}

void OrdenamientoSeleccion(int A[],int n)
{
    int i,j,min,aux; //Declaración de variables

    for(i=0; i < n; i++){ //Ciclo que se repite n veces
        min = i; //Numero minimo (Suponer que es la posicion actual)
        for(j=i; j < n; j++){ //Ciclo que recorre el arreglo para buscar el minimo
            if (A[j] < A[min]){ //Compara si la posicion actual es menor que la posicion del menor
                min = j; //Si se cumple, se tiene un nuevo numero minimo    
            }
        }
        //Intercambio de posiciones en el arreglo
        aux = A[i]; 
        A[i] = A[min];
        A[min] = aux;
    }
   

    //Despliega el arreglo ordenado
    cout << endl << endl << "Arreglo Ordenado: " << endl;
    for(i=0; i < n; i++)
        cout << A[i] << " ";
}

