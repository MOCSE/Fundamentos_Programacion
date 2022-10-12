# 3) Realiza una función llamada relacion() que a partir de dos números cumpla lo siguiente:

    #Si el primer número es mayor que el segundo, debe devolver 1.
    #Si el primer número es menor que el segundo, debe devolver -1.
    #Si ambos números son iguales, debe devolver un 0.
    # ** Comprueba la relación entre los números: '5 y 10', '10 y 5' y '5 y 5'**

# 4) Realiza una función llamada intermedio() que a partir de dos números, devuelva su punto intermedio:
    # Nota: El número intermedio de dos números corresponde a la suma de los dos números dividida entre 2

def relacion(numero1,numero2):
    if numero1 > numero2:
        return 1
    elif numero1 < numero2:
        return -1
    elif numero1 == numero2:
        return 0

def intermedio(numero1,numero2):
    return (numero1+numero2) / 2

print("Relacion: " , relacion(5,10))
print("Relacion: " , relacion(10,5))
print("Relacion: " , relacion(5,5))

print("Intermedio:",intermedio(-12,24))