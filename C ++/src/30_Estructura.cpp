#include <iostream>

using namespace std;

    struct coleccion_CD
    {
        char titulo[30];
        char artista[25];
        int numCanciones;
        float precio;
        char fecha_compra[20];
    }CD1,CD2,CD3; //Se puede definir las variables de la estructura de esta forma


    //Otra forma de declarar variables de la estructura
    struct  coleccion_CD CD4, CD5, CD6; 

int main()
{

    return 0;
}
