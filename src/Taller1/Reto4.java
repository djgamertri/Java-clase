package Taller1;

import java.util.Scanner;

public class Reto4 {
    public final static int Rock = 1;
    public final static int Paper = 2;
    public final static int Scissors = 3;
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        
        System.out.println("La computadora ya escojio...");
        System.out.println("Seleccione una opcion");
        System.out.println("1 -  Piedra");
        System.out.println("2 -  papel");
        System.out.println("3 -  Tijera");

        int option = Lectura.nextInt();

        int randomNumber = (int)(Math.random()*3+1);
        System.out.println(randomNumber);
        System.out.println("-------------------------------");
        switch (randomNumber) {
            case 1:
                    switch (option) {
                        case 1:
                            System.out.println("Empate");
                            System.out.println("Nadie gana");
                            break;
                        case 2:
                            System.out.println("Usted Gana");
                            System.out.println("Usted saco Papel");
                            System.out.println("La maquina saco Piedra");
                            break;
                    
                        case 3:
                            System.out.println("Gana la maquina");
                            System.out.println("Usted saco Tijera");
                            System.out.println("La maquina saco Piedra");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 2:
                    switch (option) {
                        case 1:
                            System.out.println("Gana la maquina");
                            System.out.println("Usted saco Piedra");
                            System.out.println("La maquina saco papel");
                            break;
                        case 2:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                    
                        case 3:
                            System.out.println("Usted Gana");
                            System.out.println("Usted saco Tijera");
                            System.out.println("La maquina saco papel");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 3:
                    switch (option) {
                        case 1:
                            System.out.println("Usted Gana");
                            System.out.println("Usted saco Piedra");
                            System.out.println("La maquina saco tijera");
                            break;
                        case 2:
                            System.out.println("Gana la maquina");
                            System.out.println("Usted saco Papel");
                            System.out.println("La maquina saco tijera");
                            break;
                    
                        case 3:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;
        
            default:
            System.out.println("Error");
            System.exit(0);
                break;
        }
        Lectura.close();
    }
}
