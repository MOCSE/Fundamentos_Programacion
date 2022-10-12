numero1 = int(input("Numero 1: "))
numero2 = int(input("Numero 2: "))

print("¿Qué quieres hacer? \n1) Sumar los dos números\n2) Restar los dos números\n3) Multiplicar los dos números")
menu = int(input("Selecciona una opcion: "))

if (menu == 1):
    print("Sumar los dos números:", numero1 + numero2)
elif (menu == 2):
    print("Restar los dos números:", numero1 - numero2)
elif (menu == 3):
    print("Multiplicar los dos números:", numero1 * numero2)
else:
    print("Opcion no valida")

