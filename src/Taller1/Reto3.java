package Taller1;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        

        System.out.println("Jugador, escoja");
        System.out.println("1 -  Cara");
        System.out.println("2 -  Sello");
        int option = Lectura.nextInt();

        if(option !=1 && option != 2){
            System.out.println("El opcion seleccionada es erronea");
            System.exit(0);
        }
        
        int RandomNumber = (int)(Math.random()*10+1);

        if(RandomNumber%2 == 0){
            System.out.println("Gano sello");
            if(option%2 == 0){
                System.out.println("Usted gano");
            }else{

                System.out.println("Usted Perdio");
            }
        }else{
            System.out.println("Gano cara");
            if(option%2 != 0){
                System.out.println("Usted gano");
            }else{

                System.out.println("Usted Perdio");
            }
        }

        Lectura.close();
    }
}
