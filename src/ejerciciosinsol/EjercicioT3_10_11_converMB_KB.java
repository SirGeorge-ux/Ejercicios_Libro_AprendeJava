package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_10_11_converMB_KB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int megabyte;
        int kilobyte;
        int select;
        double kb2;
        double mg2;
        System.out.println("""
                           Convertir: 
                           [1] Mb a Kb pulsa 
                           [2] Kb a Mb pulsa """);
        select = sc.nextInt();

        switch (select) {
            case 1 -> {
                System.out.println("Introduzca los Megabytes a convertir: ");
                megabyte = sc.nextInt();
                kilobyte = megabyte * 1024;
                System.out.println(kilobyte + " Kilobytes");
            }
            case 2 -> {
                System.out.println("Introduzca los Kilobytes a convertir: ");
                kb2 = sc.nextInt();
                mg2 = kb2 / 1024;
                System.out.println(mg2 + " Megabytes");
            }
            default ->
                System.out.println("Seleccion erronea");
        }
    }

}
