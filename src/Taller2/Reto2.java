package Taller2;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        System.out.println("Digite cuantos competidores participan");
        int amount = Lectura.nextInt();

        String[] name = new String [amount];
        int[] time = new int [amount];


        Lectura.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Digite el nombre del competidor");
            name[i] = Lectura.nextLine();
            System.out.println("Digite el tiempo del competidor");
            time[i] = Lectura.nextInt();
            Lectura.nextLine();
        }
        for (int j = 0; j < amount; j++) {
            System.out.println("El competidor: " + name[j] + " tuvo un tiempo de: " + time[j]);
            
        }
        Lectura.close();
        
    }
}
