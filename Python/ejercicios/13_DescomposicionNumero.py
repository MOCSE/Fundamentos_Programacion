import sys

if len(sys.argv) == 2:
    numero = str(sys.argv[1])
    longitud = len(numero)

    for i in range(longitud):
        print( "{:04d}".format( int(numero[longitud-1-i]) * 10 ** i ))

else:
    print("Error - Introduce los argumentos correctamente")
    print('Ejemplo: escribir_lineas.py 3547')