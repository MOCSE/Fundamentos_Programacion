def resta(a=None,b=None):
    if a == None or b == None:
        print("Error, debes enviar dos números a la función")
        return
    return a-b
print(resta(1,5))
print(resta())
