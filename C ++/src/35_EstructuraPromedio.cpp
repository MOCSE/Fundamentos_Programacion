#include <iostream>

using namespace std;

struct promedio
{
    float nota1;
    float nota2;
    float nota3;
};

struct alumno
{
    char nombre[100];
    char sexo[12];
    int edad;
    struct promedio promedioFinal; //estructura anidada
}Alumno;

int main()
{
    float promedio;

    cout << "Nombre Alumno: ";
    cin.getline(Alumno.nombre,100,'\n');
    cout << "Sexo Alumno: ";
    cin.getline(Alumno.sexo,12,'\n');
    cout << "Edad Alumno: ";
    cin >> Alumno.edad;

    cout << "Nota1: ";
    cin >> Alumno.promedioFinal.nota1;
    cout << "Nota2: ";
    cin >> Alumno.promedioFinal.nota2;
    cout << "Nota3: ";
    cin >> Alumno.promedioFinal.nota3;

    promedio = (Alumno.promedioFinal.nota1 + Alumno.promedioFinal.nota2 + Alumno.promedioFinal.nota3) / 3;

    system("cls");
    cout << "Nombre: " << Alumno.nombre << endl;
    cout << "Sexo: " << Alumno.sexo << endl;
    cout << "Edad: " << Alumno.edad << endl;
    cout << "Nota1: " << Alumno.promedioFinal.nota1 << endl;
    cout << "Nota2: " << Alumno.promedioFinal.nota2 << endl;
    cout << "Nota3: " << Alumno.promedioFinal.nota3 << endl;
    cout << "Promedio: " << promedio;

    return 0;
}