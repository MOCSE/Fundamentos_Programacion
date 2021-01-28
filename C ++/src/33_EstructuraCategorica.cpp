#include <iostream>
#include <string.h>

using namespace std; 

struct corredor
{
    char Nombre[100];
    int Edad;
    char Sexo[10];
    char Club[20];

}c;


int main()
{
    char categoria[] = "";

    cout << "Nombre: "; cin.getline(c.Nombre,20,'\n');
    cout << "Edad: ";   cin >> c.Edad; fflush(stdin);
    cout << "Sexo : ";  cin.getline(c.Sexo,20,'\n');
    cout << "Club: "; cin.getline(c.Club,20,'\n');

    if (c.Edad <= 18)
        strcpy(categoria,"Juvenil");
    if (c.Edad > 18 && c.Edad <= 48)
        strcpy(categoria,"Adulto");
    if (c.Edad > 48)
        strcpy(categoria,"Veterano");

    system("cls");

    cout << "Nombre: " << c.Nombre << endl;
    cout << "Edad: " << c.Edad << endl;
    cout << "Sexo: " << c.Sexo << endl;
    cout << "Club: " << c.Club << endl;
    cout << "Categoria: " << categoria << endl;

    return 0;
}