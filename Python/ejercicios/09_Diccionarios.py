# Durante el desarrollo de un pequeño videojuego se te encarga configurar 
# y balancear cada clase de personaje jugable. Partiendo que la estadística 
# base es 2, debes cumplir las siguientes condiciones:

caballero = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
guerrero  = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }
arquero   = { 'vida':2, 'ataque':2, 'defensa': 2, 'alcance':2 }

# El caballero tiene el doble de vida y defensa que un guerrero.
caballero['vida'] = guerrero['vida'] * 2
caballero['defensa'] = guerrero['defensa'] * 2

# El guerrero tiene el doble de ataque y alcance que un caballero.
guerrero['ataque']   = caballero['ataque'] * 2
guerrero['alcance']  = caballero['alcance'] * 2

# El arquero tiene la misma vida y ataque que un guerrero, pero la mitad de su defensa y el doble de su alcance.
arquero['vida']     = guerrero['vida']
arquero['ataque']   = guerrero['ataque']
arquero['defensa']  = guerrero['defensa'] / 2
arquero['alcance']  = guerrero['alcance'] * 2

# Muestra como quedan las propiedades de los tres personajes.
print("Caballero:\t", caballero)
print("Guerrero:\t", guerrero)
print("Arquero:\t", arquero)