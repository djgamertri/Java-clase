package Actividades;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int Num1 = Lectura.nextInt();

        System.out.println("Ingrese el segundo numero");
        int Num2 = Lectura.nextInt();

        if(Num1>Num2){
            int total = Num1+Num2;

            System.out.println(Num1+" Es mayor que "+Num2+" y la suma es: "+total);
        }else if (Num1<Num2){
            int total = Num2-Num1;
            System.out.println(Num2+" Es mayor que "+Num1+" y la resta es: "+total);
        }
        else{
            int total = Num2*Num1;
            System.out.println(Num2+" Es igual a "+Num1+" y la multiplicacion es: "+total);
        }
        
        Lectura.close();
        System.exit(0);
    }
}
