import sys

if len(sys.argv) == 3:
    filas = int(sys.argv[1])
    columnas = int(sys.argv[2])

    if (filas > 0 and filas < 10) and (columnas > 0 and columnas < 10):
        for i in range(filas):
            print("")
            for j in range(columnas):
                print(" * ", end='')
    else:
        print("Fuera de Rango (1-9)")
else:
    print("Error - Introduce los argumentos correctamente")
    print('Ejemplo: escribir_lineas.py 1 3 (Rango de 1-9)')
