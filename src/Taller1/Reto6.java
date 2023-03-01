package Taller1;

public class Reto6 {
    public static void main(String[] args) {
        int ShootOne = (int)(Math.random()*6+1);
        int ShootTwo = (int)(Math.random()*6+1);

        if(ShootOne == 1 && ShootTwo == 1){
            System.out.println("Ganaste");
            System.out.println("El primer dado saco: " + ShootOne);
            System.out.println("El segundo dado saco: " + ShootTwo);
        }else{

        int total = ShootOne+ShootTwo;
        
        switch (total) {
            case 2:
                System.out.println("Ganaste");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                System.out.println("la suma es: " + (ShootOne+ShootTwo));
                break;

            case 3:
                System.out.println("Ganaste");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                System.out.println("la suma es: " + (ShootOne+ShootTwo));
                break;
            
            case 7:
                System.out.println("Ganaste");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                System.out.println("la suma es: " + (ShootOne+ShootTwo));
                break;

            case 11:
                System.out.println("Ganaste");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                System.out.println("la suma es: " + (ShootOne+ShootTwo));
                break;
                
            case 12:
                System.out.println("Ganaste");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                System.out.println("la suma es: " + (ShootOne+ShootTwo));
                break;
            default:
                System.out.println("Perdio");
                System.out.println("El primer dado saco: " + ShootOne);
                System.out.println("El segundo dado saco: " + ShootTwo);
                break;
        }
        }
    }
}
