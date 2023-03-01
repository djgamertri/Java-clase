package Taller1;

import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        int games = 0;
        int  follow = 1;

        System.out.println("digite la cantidad global para apostar");
        int global = Lectura.nextInt();
        
        
        while (follow==1) {
            
            if(global==0){
                System.out.println("No cuentas con dinero suficiente para apostar");
                follow=0;
            }

            System.out.println("cuanto desea apostar");
            int bet = Lectura.nextInt();

            while (bet > global) {
                System.out.println("Como maximo puede apostar " + global);
                System.out.println("ingrese su apuesta");
                bet = Lectura.nextInt();
            }
            
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
                    global = global+bet;
                    bet = bet*2;
                    System.out.println("Global "+ global);
                    System.out.println("Su apuesta se duplico "+ bet);

                }else{
                    System.out.println("Usted Perdio");
                    global=global-bet;
                    System.out.println("Global "+ global);
                }
            }else{
                System.out.println("Gano cara");
                if(option%2 != 0){
                    System.out.println("Usted gano");
                    global = global+bet;
                    bet = bet*2;
                    System.out.println("Global "+ global);
                    System.out.println("Su apuesta se duplico "+ bet);
                }else{
    
                    System.out.println("Usted Perdio");
                    global=global-bet;
                    System.out.println("Global "+ global);
                }
            }

            System.out.println("Quiere seguir jugando?");
            System.out.println("1 Si");
            System.out.println("2 No");
            follow = Lectura.nextInt();

            games++;

        }
        

        System.out.println(follow);
        System.out.println("Jugaste "+games+" veces");
        System.out.println("Tu dinero acumulado es "+global);


        

        Lectura.close();
    }
}
