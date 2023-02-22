package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Si quieres dividir una canditad: \n Si[1] \n No[2]\n");
        int e = Integer.parseInt(sc.nextLine());

        if (e == 1) {
            System.out.print("Entre cuantos vais a dividir ");
            int user = Integer.parseInt(sc.nextLine());
            System.out.println("Cantidar a dividir: ");
            int num1 = Integer.parseInt(sc.nextLine());
            int r = num1 / user;
            System.out.println("Se repartiria entre los " + user + " quedaria para cada uno: \n" + r);
        } else {

            System.out.print("Introduce el primer numero: ");
            int primero = Integer.parseInt(sc.nextLine());

            System.out.print("Introduce el segundo numero: ");
            int segundo = Integer.parseInt(sc.nextLine());

            int suma = primero + segundo;
            int user = 0;
            int resta = primero - user;
            int multip = primero * segundo;

            System.out.println("Primer numero " + primero + " segundo numero" + segundo + " la suma es " + suma);
            System.out.println("Primer numero " + primero + " segundo numero" + segundo + " la suma es " + resta);
            System.out.println("Primer numero " + primero + " segundo numero" + segundo + " la suma es " + multip);
            System.out.println();

        }
    }
}
