
package tests;

import java.util.Objects;


public class Persona {
    
    
    private String nombre;
    private int edad;
    private String zodiaco;
    private static int contador = 0;
    

    public Persona(String nombre, int edad, String zodiaco) {
        this.nombre = nombre;
        this.edad = edad;
        this.zodiaco = zodiaco;
        this.contador++;
    }
    
    /**
     * Obtener Nombre Test xd
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getZodiaco() {
        return zodiaco;
    }

    public void setZodiaco(String zodiaco) {
        this.zodiaco = zodiaco;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", zodiaco=" + zodiaco + '}' + "| Conteo: " + contador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.zodiaco, other.zodiaco);
    }
    
    
}
