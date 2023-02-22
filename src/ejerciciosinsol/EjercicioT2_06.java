package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT2_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float iva;
        float precio, r;
        float total = 100;

        System.out.println("Introduzca el precio a calcular ");
        precio = sc.nextInt();

        iva = (precio * 21) / total;
        r = precio + iva;
        System.out.print("El precio mas IVA: " + r);

    }
}
