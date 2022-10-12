# 1) Realiza una función llamada area_rectangulo() que devuelva el área del rectangulo a partir de una base y una altura. Calcula el área de un rectángulo de 15 de base y 10 de altura.
# 2) Realiza una función llamada area_circulo() que devuelva el área de un círculo a partir de un radio. Calcula el área de un círculo de 5 de radio: 

import math

def area_rectangulo(base, altura):
    return base*altura

def area_circulo(radio):
    return (radio**2) * math.pi

print("Area Rectangulo:",area_rectangulo(15,10))
print("Area Circulo:", area_circulo(5))