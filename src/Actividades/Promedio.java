package Actividades;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        double nota=0;

        System.out.println("Debe dijitar la nota de los 4 talleres");
        for (int i = 0; i < 4; i++) {
            System.out.println("dijite la nota");
            nota += Lectura.nextDouble();
        }
        double promedio = nota/4;
        if(promedio > 0.0 && promedio <= 2.9){
            System.out.println("Reprobaste la asignatura");
            System.out.println("su promedio es de " + promedio);
        }else if(promedio >= 3.0 && promedio <= 4.0){
            System.out.println("pasaste raspando");
            System.out.println("su promedio es de " + promedio);
        }else if(promedio >4.0 && promedio <= 5.0 ){
            System.out.println("Aprobaste la asignatura con buenos resultados");
            System.out.println("su promedio es de " + promedio);
        }else{
            System.out.println("Nota incorrecta");
        }
        Lectura.close();
    }
}
