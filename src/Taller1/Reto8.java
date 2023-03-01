package Taller1;

import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        int shootOne = (int)(Math.random()*4+1);
        int total = 0;
        int result = 0;

        System.out.println("Estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si es que es mayor a 50.000 y dependiendo de tu suerte");
        System.out.println("Ingrese la cantidad de productos");
        int stock = Lectura.nextInt();
        for (int i = 0; i < stock; i++) {
            System.out.println("Ingrese el precio del producto ");
            total += Lectura.nextInt();
            System.out.println(total);
        }
        
        System.out.println("El total de su compra es: "+total);
        System.out.println("Dijite el valor de su pago");

        int pay = Lectura.nextInt();

        while (total>pay) {
            System.out.println("Pago insuficiente intente nuevamente");
            pay = Lectura.nextInt();
        }
        
        if(total<=50000){
            System.out.println("lo sentimos su compra no es beneficiaria de nuestra prmocion de aniversario");
            System.out.println("Su cambio es:" + (pay-total));
            System.exit(0);
        }

        switch (shootOne) {
            case 1:
                System.out.println("has sacado la bola roja tienes un 10% de descuento");
                result = (total*10)/100;
                System.out.println("Su cambio es: " + (pay-result) );
                break;
            case 2:
                System.out.println("has sacado la bola roja tienes un 30% de descuento");
                result = (total*30)/100;
                System.out.println("Su cambio es:" + (pay-result));
                break;
            case 3:
                System.out.println("has sacado la bola roja tienes un 50% de descuento");
                result = (total*50)/100;
                System.out.println("Su cambio es:" + (pay-result));
                break;
            default:
                System.out.println("has sacado la bola roja tienes un 100% de descuento");
                System.out.println("felicidades");
                System.out.println("el valor de su compra es: 0");
                break;
        }
        Lectura.close();
    }    
}
