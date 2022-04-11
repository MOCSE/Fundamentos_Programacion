//Lenguaje C++

#include <iostream> //Libreria de entrada y salida de datos <3
using namespace std; //Estandar de c++ | Flujos de entrada y salida


int main(){
	
	cout<<"Este es un espacio en pantalla :O"<<endl; //Espacio en pantalla
	cout<<"Hola Mundo :D \n"; //Imprimir en pantalla
	
		int entero = 15;
		float flotante = 12.33;
		double doble = 10.12312;
		char cara = 'a';
		
		//Imprimir y concatenar
		cout<<"Entero: "<< entero << "| Flotante: " << flotante << "| Doble: " << doble << "| Char: " << cara <<endl;

		int i,j,k,n=3,c=1;

		for (i = 0; i <= n; i++)
			for (j = i; j <= n; j++)
				for (k = j; k <= n; k++)
		{
			cout<< "c:" << c << " - ";
			cout << i << "--"; cout << j << "--"; cout << k << endl;
			c++;
		}

		
		


	
	return 0; //Buenas practicas de programaci�n, YEIIIIII
}


