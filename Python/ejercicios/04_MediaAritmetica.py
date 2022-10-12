cantidad = int(input("Numeros a introducir: "))
suma = 0

for x in range(cantidad):
    suma += float(input("Introduce un numero: "))

print("se pidio ",cantidad," y la media es: ", suma/cantidad)
