package test;

import BaseDatos.Conexion;
import BaseDatos.PersonaDAO;
import BaseDatos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                //Quitar el AutoCommit
                conexion.setAutoCommit(false);
            }
            
            //Implementando interface
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            for(PersonaDTO persona: personas){
                System.out.println(persona);
            }
            
            conexion.commit();
            
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
