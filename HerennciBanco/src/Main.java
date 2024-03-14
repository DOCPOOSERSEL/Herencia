import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Comissions Sandwich = new Comissions( "Sandwich","lechuga", "457-4589-45", 0.1 , 1555);
        System.out.println("El empleado: "+ Sandwich);
        System.out.println("La ganancia por comision dado que se cobro $1555 es: "+ Sandwich.calculateComissionPay());

    }
}