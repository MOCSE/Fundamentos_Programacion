package Conexion;

import java.sql.*;

public class ConexionSQL_JDBC {
    public static void main(String[] args) {
        //Cadena de Conexion BD || ? parametros
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            //Para aplicaciones web para una conexion exitosa, en aplicaciones locales no es necesario
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexion = DriverManager.getConnection(url,"root", "1234");
            
            Statement intruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = intruccion.executeQuery(sql);
            
            while (resultado.next()) {                
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            intruccion.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
