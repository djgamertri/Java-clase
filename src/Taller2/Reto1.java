package Taller2;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {        
        Scanner lectura = new Scanner(System.in);

        double prom=0;

        System.out.println("digite la cantidad de notas a evaluar");
        int amount = lectura.nextInt();

        double[] option = new double [amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Digite la nota");
            option[i] = lectura.nextDouble();
        }
        for (double nota : option) {
            prom+=nota;
        }
        prom = prom/amount;
        if(prom>3){
            System.out.println("Reprobaste");
            System.out.println("El promedio final de la materia es "+ prom);
        }else if(prom >= 3 && prom <= 4){
            System.out.println("Pasaste raspando");
            System.out.println("El promedio final de la materia es "+ prom);
        }else if(prom > 4){
            System.out.println("Su nota es excelente");
            System.out.println("El promedio final de la materia es "+ prom);
        }
        lectura.close();
    }
}
