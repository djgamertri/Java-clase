package Actividades;

import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int[] opcion = new int [10];
        int contM = 0;
        int contF = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Dijite 1 si es hombre o 2 si es mujer");
            opcion[i]=Lectura.nextInt();
        }
        for (int sexo : opcion) {
            if(sexo==1){
                System.out.println("Hombre");
                contM++;
            }else{
                System.out.println("Mujer");
                contF++;
            }
            System.out.println("hay " + contM + " hombres");
            System.out.println("hay " + contF + " mujeres");

        }
        Lectura.close();
    }
}
