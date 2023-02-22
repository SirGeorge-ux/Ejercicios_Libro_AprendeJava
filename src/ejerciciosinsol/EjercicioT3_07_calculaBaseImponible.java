package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_07_calculaBaseImponible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double factura;
        double base = 1.21;
        System.out.println("Introduce el total una factura: ");
        factura = Double.parseDouble(sc.nextLine());
        double r = factura / base;
        System.out.printf("La base imponible es: %.2f \n", r);
    }
}
