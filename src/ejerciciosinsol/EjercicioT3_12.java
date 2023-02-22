
package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_12 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        // Pedir la base imponible
        System.out.print("Introduce la base imponible del producto: ");
        double baseImponible = sc.nextDouble();
        
        // Pedir el tipo de IVA
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = sc.next();
        
        // Calcular el porcentaje de IVA a aplicar
        double porcentajeIVA;
        switch (tipoIVA) {
            case "general" -> porcentajeIVA = 0.21;
            case "reducido" -> porcentajeIVA = 0.1;
            case "superreducido" -> porcentajeIVA = 0.04;
            default -> {
                System.out.println("Tipo de IVA no válido.");
                return;
            }
        }
        
        // Pedir el código promocional
        System.out.print("Introduce el codigo promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = sc.next();
        
        // Calcular el precio final según el código promocional
        double precioFinal = baseImponible * (1 + porcentajeIVA);
        switch (codigoPromocional) {
            case "nopro" -> {
            }
            case "mitad" -> precioFinal /= 2;
            case "meno5" -> precioFinal -= 5;
            case "5porc" -> precioFinal *= 0.95;
            default -> {
                System.out.println("Código promocional no válido.");
                return;
            }
        }
        
        // Mostrar el precio final
        System.out.printf("El precio final del producto es: %.2f euros.%n", precioFinal);
        System.out.printf("Base imponible "+baseImponible);
        System.out.printf("IVA (10%) ");
        System.out.printf("Precio con IVA ");
        System.out.printf("Cód. promo. ("+codigoPromocional+"): ");
        System.out.printf("TOTAL ");
    }
}/*  
Base imponible 25.00
IVA (10%) 2.50
Precio con IVA 27.50
Cód. promo. (mitad): -13.75
TOTAL 13.75 */
