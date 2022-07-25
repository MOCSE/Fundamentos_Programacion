package CajaFuerte;

public class CajaFuerte {
    private int password;

    public CajaFuerte(int password) throws Exception{
        if(password < 99 || password > 999 )
            throw new Exception("Contraseña no valida, solo se aceptan 3 digitos");
        this.password = password;
    }
    
    public void open(int password){
        if(this.password == password)
            System.out.println("CajaFuerte Abierta!");
        else
            System.out.println("Contraseña Incorrecta");
    }
    
    public void changeCombo(int password, int changePass){
        if(this.password == password){
            this.password = changePass;
            System.out.println("Contraseña Modificada Correctamente");
        }
        else
            System.out.println("No se puede modificar, contraseña anterior no coincide");
    }
}
