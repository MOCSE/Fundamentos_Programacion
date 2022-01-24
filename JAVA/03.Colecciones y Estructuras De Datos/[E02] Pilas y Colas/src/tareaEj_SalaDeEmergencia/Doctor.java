
package tareaEj_SalaDeEmergencia;

public class Doctor {
    private String nombre;
    private String escuela;
    private String estado;

    public Doctor(String nombre, String escuela, String estado) {
        this.nombre = nombre;
        this.escuela = escuela;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuela() {
        return escuela;
    }

    @Override
    public String toString() {
        return "Doctor{" + nombre + "  || estado=" + estado + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
