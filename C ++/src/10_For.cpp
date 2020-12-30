#include <iostream>

using namespace std;

int main()
{
    int i;
    float temp_media=0,temp_mayor=-99999,temp_menor=99999,temp;

    for (i = 1; i <= 6; i++)
    {
        cout << "Temperatura Hora " << i*4 << ": ";
        cin >> temp;
        temp_media += temp;
        
        if(temp > temp_mayor)
            temp_mayor = temp;
        if (temp < temp_menor)
            temp_menor = temp;
    }

    temp_media = temp_media/6;

    cout << "Temperatura Media: " << temp_media << endl;
    cout << "Temperatura Mayor: " << temp_mayor << endl;
    cout << "Temperatura Menor: " << temp_menor << endl;

    return 0;
}