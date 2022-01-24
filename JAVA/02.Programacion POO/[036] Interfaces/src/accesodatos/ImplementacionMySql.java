
package accesodatos;

//implements || obligar a las clases los metodos de la interface especificada
public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar Desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar Desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar Desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar Desde Mysql");
    }
      
}
