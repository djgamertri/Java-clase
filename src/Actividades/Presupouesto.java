package Actividades;

import java.util.Scanner;

public class Presupouesto {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int buget = 100000;
        int cont = 0;
        int option = 1;
        int totalSpend = 0;
        while (cont!=3) {
            System.out.println("Desea registrar un gasto?");
            System.out.println("Digite 1 si quiere registrar");
            System.out.println("Digite 2 si no quiere registrar");
            option = Lectura.nextInt();
            if (option == 1) {
                System.out.println("Digite el gasto");
                int spend = Lectura.nextInt();
                buget = buget - spend;
                totalSpend = totalSpend + spend;
                cont++;
            }else{
                System.out.println(option);
                cont=3;
            }
        }
        System.out.println("No puedes registrar mas gastos");
        System.out.println("El total de tus gastos fueron " + totalSpend);
        System.out.println("El presupuesto restante es " + buget);
        Lectura.close();
    }
}
