package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT2_04_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Elije que quieres convertir:\n[1] EUR-PST\n[2] PST-EUR\n[3] HEX-DEC");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Has elegido EUROS a PESETAS");
                // Pedimos al usuario que introduzca el importe en euros
                System.out.print("Introduce el importe en euros: ");
                double importeEuros = sc.nextDouble();

                // Convertimos el importe a pesetas utilizando el tipo de cambio actual
                final double tipoCambioE = 166.386; // 1 euro = 166.386 pesetas (a fecha de 2021)
                double importePesetas = importeEuros * tipoCambioE;

                // Mostramos el resultado de la conversión
                System.out.println(importeEuros + " euros son " + importePesetas + " pesetas.");
                break;
            }
            case 2 -> {
                System.out.println("Has elegido PESETAS a EURO");
                // Pedimos al usuario que introduzca el importe en pesetas
                System.out.print("Introduce el importe en pesetas: ");
                double importePesetas2 = sc.nextDouble();

                // Convertimos el importe a euros utilizando el tipo de cambio actual
                final double tipoCambioP = 0.0060; // 1 peseta = 0.0060 euros (a fecha de 2021)
                double importeEuros2 = importePesetas2 * tipoCambioP;

                // Mostramos el resultado de la conversión
                System.out.println(importePesetas2 + " pesetas son " + importeEuros2 + " euros.");
                break;
            }
            case 3 -> {
                System.out.println("Has elegido Hexadecimal a Decimal");
                // Pedimos al usuario que introduzca un número hexadecimal
                System.out.print("Introduce un número hexadecimal: ");
                String hex = sc.nextLine();

                // Convertimos el número hexadecimal a decimal
                int dec = Integer.parseInt(hex, 16);

                // Mostramos el resultado de la conversión
                System.out.println(hex + " en hexadecimal es " + dec + " en decimal.");
                break;

            }
        }
    }
}
