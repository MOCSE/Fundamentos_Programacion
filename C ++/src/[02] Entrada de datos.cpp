#include <iostream>
#include <math.h> //Libreria operadores como raiz o exponentes 

using namespace std; 

int main(){
	cout.precision(3); //Numeros a mostrar en pantalla
	
	
	//1. Escribe la siguiente funcion como expresion en C++ (a/b)+1
	cout<<"Programa 1"<<endl;
	
	float A,B,C;
	
	cout << "Ingrese A: "; cin >> A; //Leer datos de entrada
	cout << "Ingrese B: "; cin >> B;
	
	C=(A/B)+1; 
	
	cout <<"Tu resultado Es: " <<C<<endl<<endl;
	
		system("pause"); //Presione una tecla para continuar
		system("cls"); //Limpia la consola
		






	//2. Escribe la siguiente funcion como expresion en C++ f(x,y) = Raiz(x) / y^2-1
	cout<<"Programa 2"<<endl;
	
	float x,y,z;
	
	cout << "Ingrese X: "; cin >> x;
	cout << "Ingrese Y: "; cin >> y;
	
	//Sqrt(x) -> Raiz || pow(x,^) -> Exponente
	z = ((sqrt(x)) / (pow(y,2)-1));
	
	cout <<"El resultado de la Funcion es: " <<z<<endl<<endl;
	
	return 0; 
}

