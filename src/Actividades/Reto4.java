package Actividades;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        int age;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese su edad");
        age = lectura.nextInt();
        if(age<18){
            System.out.println("No puede ingresar");
        }
        else{
            System.out.println("Bienvenid@");
        }
        lectura.close();
    }
}
