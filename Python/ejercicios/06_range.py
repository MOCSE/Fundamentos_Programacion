
# Pista: Utiliza el tercer parámetro de la función range(inicio, fin, salto).

print("Todos los números del 0 al 10 [0, 1, 2, ..., 10]")
print(list(range(11)))

print("Todos los números del -10 al 0 [-10, -9, -8, ..., 0]")
print(list(range(-10,1)))

print("Todos los números pares del 0 al 20 [0, 2, 4, ..., 20]")
print(list(range(0,21,2)))

print("Todos los números impares entre -20 y 0 [-19, -17, -15, ..., -1]")
print(list(range(-19,0,2)))

print("Todos los números múltiples de 5 del 0 al 50 [0, 5, 10, ..., 50]")
print(list(range(0,51,5)))