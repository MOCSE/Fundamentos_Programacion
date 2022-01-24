/* Una interfaz en Java es una colección de métodos abstractos y propiedades constantes. 
    En las interfaces se especifica qué se debe hacer pero no su implementación. 
    Serán las clases que implementen estas interfaces las que describen la lógica del comportamiento de los métodos.*/

package test;

import accesodatos.*;

public class testInterfaces {
    public static void main(String[] args) {
        
       //Apunta a diferentes implementaciones
       IAccesoDatos datos;
       
       datos = new ImplementacionMySql();
       datos.listar();
       imprimir(datos);
       
        System.out.println();
       
       datos = new ImplementacionOracle();
       datos.listar();
       imprimir(datos);
       
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.eliminar();
    }
}
