# Crea un conjunto llamado usuarios con los usuarios Marta, David, Elvira, Juan y Marcos
usuarios = {"Marta", "David", "Elvira", "Juan", "Marcos"}
# Crea un conjunto llamado administradores con los administradores Juan y Marta.
administradores = {"Juan","Marta"}

# Borra al administrador Juan del conjunto de administradores.
administradores.remove("Juan")

# Añade a Marcos como un nuevo administrador, pero no lo borres del conjunto de usuarios.
administradores.add("Marcos")
print("\n",usuarios)

for persona in usuarios:
    if persona in administradores:
        print(persona, "Es Administrador")
    else:
        print(persona, "Es usuario")