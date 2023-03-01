package Actividades;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de productos");
        int amount = Lectura.nextInt();

        int pay = amount*10000;

        System.out.println("Ingrese Cuanto paga");
        int payment = Lectura.nextInt();
        
        if(payment>pay){
            System.out.println("Pago insuficiente");
            System.exit(0);
        }

        int result = payment-pay;

        System.out.println("El valor de la compra es: "+amount);
        System.out.println("Su cambio es: "+ result);


        // int RandomNumber = (int)(Math.random()*10);

        // System.out.println(RandomNumber);


        Lectura.close();
        System.exit(0);
    }
}
