
# "Hola Mundo" → Alineado a la derecha en 20 caracteres
print( "{:>20}".format("Hola Mundo") )

# "Hola Mundo" → Truncamiento en el cuarto carácter (índice 3)
print( "{:.4}".format("Hola Mundo") )

# "Hola Mundo" → Alineamiento al centro en 20 caracteres con truncamiento en el segundo carácter (índice 1)
print( "{:^20.2}".format("Hola Mundo") )

# 150 → Formateo a 5 números enteros rellenados con ceros
print( "{:05d}".format(150) )

# 7887 → Formateo a 7 números enteros rellenados con espacios
print( "{:7d}".format(7887) )

# 20.02 → Formateo a 3 números enteros y 3 números decimales
print( "{:07.3f}".format(20.02) )