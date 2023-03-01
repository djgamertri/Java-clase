package Taller1;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        int shootOne = (int)(Math.random()*4+1);

        System.out.println("Estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si es que es mayor a 50.000 y dependiendo de tu suerte");
        System.out.println("Ingrese el valor de su compra");
        int total = Lectura.nextInt();

        if(total<=50000){
            System.out.println("lo sentimos su compra no es beneficiaria de nuestra prmocion de aniversario");
            System.out.println("el valor de su compra es:  " + total);
            System.exit(0);
        }

        switch (shootOne) {
            case 1:
                System.out.println("has sacado la bola roja tienes un 10% de descuento");
                System.out.println("el valor de su compra es " + (total*10)/100);
                break;
            case 2:
                System.out.println("has sacado la bola roja tienes un 30% de descuento");
                System.out.println("el valor de su compra es " + (total*30)/100);
                break;
            case 3:
                System.out.println("has sacado la bola roja tienes un 50% de descuento");
                System.out.println("el valor de su compra es " + (total*50)/100);
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
