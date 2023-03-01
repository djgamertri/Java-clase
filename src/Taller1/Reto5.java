package Taller1;
import  java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        
        System.out.println("dijite su nombre");
        String name = Lectura.nextLine();
        System.out.println("dijite su apellido");
        String lastName = Lectura.nextLine();

        System.out.println("------------------------------------");

        System.out.println("Su nombre tiene una longitud de : "+ name.length());
        System.out.println("Su apellido tiene una longitud de : "+ lastName.length());

        System.out.println("------------------------------------");

        System.out.println(name.toUpperCase() + " " + lastName.toLowerCase());

        String nameComplete = name + " " + lastName;

        System.out.println("------------------------------------");

        System.out.println(nameComplete);

        System.out.println("------------------------------------");

        System.out.println(name.substring(0, 2)+lastName);

        Lectura.close();
    }
}
