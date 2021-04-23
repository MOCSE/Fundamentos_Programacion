#include <iostream>

using namespace std;


int main()
{
    int n,i_empleadoMay,i_empleadoMen;
    float may=0,men=0;
    cout << "Numero de empleados: ";
    cin >> n;

    struct empleado
    {
        char nombre[100];
        float salario;
    }empleados[n];

    for (int i = 0; i < n; i++)
    {
        fflush(stdin); //Vaciar el buffer
        cout << "Nombre: ";
        cin.getline(empleados[i].nombre,100,'\n');
        cout << "Salario: ";
        cin >> empleados[i].salario;
    }

    may = empleados[0].salario;
    men = empleados[0].salario;
    
    for (int i = 0; i < n; i++)
    {
        if (empleados[i].salario > may){
            may = empleados[i].salario;
            i_empleadoMay = i;
        }
        if (empleados[i].salario < may){
            men = empleados[i].salario;
            i_empleadoMen = i;
        }
    }

    cout << "Mayor: " << empleados[i_empleadoMay].nombre << " | Salario: " << may << endl;
    cout << "Menor: " << empleados[i_empleadoMen].nombre << " | Salario: " << men << endl;

    return 0;
}