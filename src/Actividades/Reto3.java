package Actividades;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        double[] arreglo = {2.0, 1.2, 1.5};
        double min = arreglo[0];
        
        // Encuentra el valor mínimo
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }

        // Muestra el valor mínimo
        System.out.println("El valor mínimo en el arreglo es: " + min);
    }

}
