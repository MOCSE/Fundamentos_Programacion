package test;

import BaseDatos.Conexion;
import BaseDatos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                //Quitar el AutoCommit
                conexion.setAutoCommit(false);
            }       
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            
            Persona cambioPersona = new Persona(5, "CarlitosXD", "Martinez", "popo12@gmail.com", "5543126789");
            personaDAO.Actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona("David", "Romero", "x2233312@gmail.com", "5543126711");
            personaDAO.insertar(nuevaPersona);
            
            //Commit para confirmar conjunto de intrucciones a realizar
            conexion.commit();
            System.out.println("Se ha hecho commit exitosamente");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Entrando a rollback");
            try {
                //No hacer commit
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
    }
}
