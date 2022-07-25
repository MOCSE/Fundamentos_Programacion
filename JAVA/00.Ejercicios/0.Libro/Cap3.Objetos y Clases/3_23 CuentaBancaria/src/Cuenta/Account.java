package Cuenta;

public class Account {
    private static int idContador = 0;
    private int id;
    private String nombre;
    private double balance;

    /**
     * Constructor Para la creacion de cuentas bancarias
     * @param nombre
     */
    public Account(String nombre) {
        this.id = ++this.idContador;
        this.nombre = nombre;
    }

    /**
     * Consultar saldo
     */
    public void getBalance() {
        System.out.println("Su Balance es: " + this.balance);
    }
    
    /**
     * Depositar Saldo
     * @param money 
     */
    public void deposit(double money){
        this.balance += money;
        System.out.println("Se ha depositado con exito " + money);
        System.out.println("Su nuevo saldo es: " + this.balance);
    }
    
    /**
     * Retirar Saldo
     * @param money 
     */
    public void withdraw(double money) throws IllegalAccessError{
        if(this.balance - money < 0){
            throw new IllegalAccessError("No hay suficiente fondos para el retiro");
        }
        
        this.balance -= money;
        System.out.println("Se ha retirado con exito " + money);
        System.out.println("Su nuevo saldo es: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account{" + "nombre=" + nombre + ", balance=" + balance + '}' + " | ID: " + id;
    }
    
    
}
