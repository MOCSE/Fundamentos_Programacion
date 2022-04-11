package test;

import BaseDatos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        
        //Insertar persona
        Persona persona = new Persona("Carlos", "Esparza", "cerespara@gmail.com", "5560982321");
        personaDAO.insertar(persona);

        //Modificar Persona
        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "JU67sadqh@gmail.com", "5560442321");
        personaDAO.Actualizar(personaModificar);

        //Eliminar Persona
        Persona personaEliminar = new Persona(4);
        personaDAO.Eliminar(personaEliminar);
        
        //Seleccionar persona
        List<Persona> personas = personaDAO.seleccionar();
        personas.forEach(System.out::println);
    }
}
