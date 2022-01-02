/* Una interfaz en Java es una colección de métodos abstractos y propiedades constantes. 
    En las interfaces se especifica qué se debe hacer pero no su implementación. 
    Serán las clases que implementen estas interfaces las que describen la lógica del comportamiento de los métodos.*/

package accesodatos;

//No hereda de la clase Object y no tiene constructores, pero es posible crear interfaces heredadas (hijas)
public interface IAccesoDatos {
    
    //Atributos son CONSTANTES
    int MAX_REGISTRO = 10;
    
    //Metodo Abstracto
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
