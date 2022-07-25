package Cuenta;

public class testCuentas {

    public static void main(String[] args) {
        Account cuenta1 = new Account("Oscar David Romero Hernández");
        Account cuenta2 = new Account("Laura Hernández Muñoz");
        Account cuenta3 = new Account("Modesto Romero Sanchez");

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println();

        try {
            cuenta1.deposit(10000);
            cuenta1.withdraw(11500);
        } catch (IllegalAccessError e) {
            System.out.println(e);
        }

    }

}
