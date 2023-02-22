package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_04_calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("""
                        CALCULADORA CLASSIC <<_TALEGUEITOR_>>
                        Selecciones la accion que desea realizar:  
                        [1] Suma 
                        [2] Resta 
                        [3] Multiplicar 
                        [4] Dividir 
                         """);
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1 -> {
                System.out.print("Introduzca primer digito a sumar: ");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca segundo digito a sumar: ");
                int num2 = Integer.parseInt(sc.nextLine());
                int rs = num1 + num2;
                System.out.println("Resultado total: " + rs);
            }
            case 2 -> {
                System.out.print("Introduzca primer digito a restar: ");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca segundo digito a restar: ");
                int num2 = Integer.parseInt(sc.nextLine());
                int rr = num1 - num2;
                System.out.println("Resultado total: " + rr);
            }
            case 3 -> {
                System.out.print("Introduzca primer digito a multiplicar: ");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca segundo digito a mulriplicar: ");
                int num2 = Integer.parseInt(sc.nextLine());
                int rm = num1 * num2;
                System.out.println("Resultado total: " + rm);
            }
            case 4 -> {
                System.out.print("Introduzca primer digito a dividir: ");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca segundo digito a dividir: ");
                int num2 = Integer.parseInt(sc.nextLine());
                int rd = num1 / num2;
                System.out.println("Resultado total: " + rd);
            }
            default -> {
                System.out.printf("Eleccion invalida. \nIntroduzca del 1-4 : ");
            }
        }
    }
}
