package Taller1;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
            
        System.out.println("Ingrese un numero");
        int fahrenheit = Lectura.nextInt();

        System.out.println(((fahrenheit-32)/1.8));

        Lectura.close();
    
    }
}
