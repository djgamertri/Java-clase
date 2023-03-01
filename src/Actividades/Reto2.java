package Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        ArrayList<Integer> prices = new ArrayList<Integer>(); 
        int total = 0;

        System.out.println("Cuantos productos son?");
        int products = Lectura.nextInt();

        for (int i = 0; i < products; i++) {
            System.out.println("Cual es el precio del producto "+i);
            int price = Lectura.nextInt();
            prices.add(price);
        }
        
        for (Integer key : prices) {
            System.out.println("Precio producto : "+key);
            total += key;
        }
        System.out.println("Total : "+total);
        Lectura.close();
    }
}
