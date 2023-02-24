package Taller1;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
            
        System.out.println("Ingrese el peso del bebe");
        int weight = Lectura.nextInt();

        System.out.println("Ingrese los meses del bebe");
        int months = Lectura.nextInt();

        if(months>=12){
            System.out.println("El bebe no puede ser mayor a 1 año");
            System.exit(0);
        }

        float result = (weight+10/months*10)*8;

        System.out.println("la dosis necesario es: "+result);
    
        Lectura.close();
        System.exit(0);
    }
}
