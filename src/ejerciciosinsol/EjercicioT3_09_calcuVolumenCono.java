package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_09_calcuVolumenCono {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radio;
        double altura;
        double pi = 3.14;
        double g;

        System.out.println("radio del cono: ");
        radio = sc.nextDouble();

        System.out.println("altura del cono: ");
        altura = sc.nextDouble();

        g = pi * (radio * radio) * altura / 3;

        System.out.println("La volumen del cono es: " + g);
    }
}
