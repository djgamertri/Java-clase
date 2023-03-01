package Actividades;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int Num1 = Lectura.nextInt();

    
        if(Num1==0){
            System.out.println("El numero es neutro");
            System.exit(0);

        }else if (Num1<0){
            System.out.println("El numero es negativo");
            System.exit(0);            
        }
        else{
            System.out.println("El numero es positivo");
            System.exit(0);
        }
        
        Lectura.close();
        System.exit(0);
    }    
}
