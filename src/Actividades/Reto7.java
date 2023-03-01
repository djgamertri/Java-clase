package Actividades;

import java.util.Scanner;

public class Reto7 {
    public final static String UserBD = "Erick";
    public final static String PassBD = "pass123";
    public static void main(String[] args) {

        Scanner Lectura = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String user = Lectura.nextLine();
        System.out.println("Ingrese su contraseña");
        String pass = Lectura.nextLine();

        if(user.equals(UserBD) && pass.equals(PassBD)){
            System.out.println("Bienvenido");
        }
        else if(user != UserBD && pass.equals(PassBD)){
            System.out.println("Credenciales Incorrectas");
        }
        else if(user.equals(UserBD) && pass != PassBD){
            System.out.println("Parece que olvidaste tu contraseña");
        }
        else if(user != UserBD && pass != PassBD){
            System.out.println("Acceso Denegado");
        }else{
            System.err.println("Datos Corruptos");
        }

        Lectura.close();
        System.exit(0);
    }
}
