import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Lectura = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numberOne = Lectura.nextInt();
        
        System.out.println("Ingrese un numero");
        int numberTwo = Lectura.nextInt();
        
        Lectura.nextLine(); //limpieza de buffer//
        
        System.out.println("Ingrese tu nombre");
        String name = Lectura.nextLine(); 
        
        System.out.println("Hola " + name + "," + "ingresaste los numeros " + numberOne + " y " + numberTwo + " y el resultado de la suma es " + (numberOne + numberTwo) );
        
        Lectura.close();
    }
}
