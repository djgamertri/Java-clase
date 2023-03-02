package Taller2;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        System.out.println("Digite cuantos competidores participan");
        int amount = Lectura.nextInt();

        int winner  = 0;
        String[] name = new String [amount];
        double[] time = new double [amount];
        Lectura.nextLine();
        
        for (int i = 0; i < amount; i++) {
            System.out.println("Digite el nombre del competidor");
            name[i] = Lectura.nextLine();
            System.out.println("Digite el tiempo del competidor");
            time[i] = Lectura.nextDouble();
            Lectura.nextLine();
        }
        double min = time[0];
        for (int j = 0; j < amount; j++) {
            if (time[j] < min) {
                min = time[j];
                winner = j;
            }
            System.out.println("El competidor: " + name[j] + " tuvo un tiempo de: " + time[j]);
        }

        System.out.println("El ganador es "+ name[winner] + " con un tiempo de " + min);

        Lectura.close();
        
    }
}
