# 5) Realiza una función llamada recortar() que reciba tres parámetros. El primero es el número a recortar, 
# el segundo es el límite inferior y el tercero el límite superior. La función tendrá que cumplir lo siguiente:

    #Devolver el límite inferior si el número es menor que éste
    #Devolver el límite superior si el número es mayor que éste.
    #Devolver el número sin cambios si no se supera ningún límite.
    

def recortar(numero,inferior,superior):
    if numero < inferior:
        return inferior
    elif numero > superior:
        return superior
    else:
        return numero

print("Recortar:", recortar(15,0,10))

# 6) Realiza una función separar() que tome una lista de números enteros y devuelva dos listas ordenadas. La primera con los números pares, y la segunda con los números impares:
    # Por ejemplo:

    # pares, impares = separar([6,5,2,1,7])
    # print(pares)   # valdría [2, 6]
    # print(impares)  # valdría [1, 5, 7]

numeros = [-12, 84, 13, 20, -33, 101, 9]

def separar(lista):
    pares = []
    impares = []
    for i in lista:
        if i % 2 == 0:
            pares.append(i)
        else:
            impares.append(i)

    return pares,impares

print("Retorno asi kk:", separar(numeros))
pares, impares = separar(numeros)

print("Lista Pares:", pares)
print("Lista Impares:", impares)