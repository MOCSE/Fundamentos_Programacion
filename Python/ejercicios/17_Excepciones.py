# 1) Localiza el error en el siguiente bloque de código. Crea una excepción para evitar que el programa se bloquee y además explica en un mensaje al usuario la causa y/o solución:
try:
    resultado = 10/0
    print("#1",resultado)
except ZeroDivisionError:
    print("No se puede dividir entre 0")

# 2) Localiza el error en el siguiente bloque de código. Crea una excepción para evitar que el programa se bloquee y además explica en un mensaje al usuario la causa y/o solución:
try:
    lista = [1, 2, 3, 4, 5]
    lista[10]
except IndexError:
    print("No se puede acceder al indice en la lista")

# 3) Localiza el error en el siguiente bloque de código. Crea una excepción para evitar que el programa se bloquee y además explica en un mensaje al usuario la causa y/o solución:
try:
    colores = { 'rojo':'red', 'verde':'green', 'negro':'black' } 
    colores['blanco']
except KeyError:
    print("No existe esta llave en el diccionario")

# 4) Localiza el error en el siguiente bloque de código. Crea una excepción para evitar que el programa se bloquee y además explica en un mensaje al usuario la causa y/o solución:
try:
    resultado = 15 + "20"
except TypeError:
    print("No se puede sumar diferentes tipos")

# 5) Realiza una función llamada agregar_una_vez() que reciba una lista y un elemento. La función debe añadir 
# el elemento al final de la lista con la condición de no repetir ningún elemento. 
# Además si este elemento ya se encuentra en la lista se debe invocar un error de tipo ValueError que debes capturar y mostrar este mensaje en su lugar:

elementos = [1, 5, -2]
def agregar_una_vez(lista, el):
    try:
        if el in lista:
            raise ValueError
        else:
            lista.append(el)
    except ValueError:
        print("Error: Imposible añadir elementos duplicados =>", el)
        
agregar_una_vez(elementos, 10)
agregar_una_vez(elementos, -2)
agregar_una_vez(elementos, "Hola")
print(elementos)
