package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_05_06_calcularArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("""
                         ¿Que quieres clacular?
                         [1]Rectangulo
                         [2]Triangulo""");

        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1 -> {
                System.out.print("""
                                                 Calcularemos el area de un rectangulo:
                                                 Introduzca la base del rectangulo:
                                                 """);
                int a1 = Integer.parseInt(sc.nextLine());

                System.out.print("""
                                                 Introduzca la altura del rectangulo:
                                                 """);
                int a2 = Integer.parseInt(sc.nextLine());

                int rectangulo = a1 * a2;
                System.out.println("El Area del rectangulo es: " + rectangulo);
            }
            case 2 -> {
                System.out.print("""
                                                 Calcularemos el area de un triangulo:
                                                 Introduzca base del angulo:
                                                 """);
                int t1 = Integer.parseInt(sc.nextLine());

                System.out.print("""
                                                 Introduzca altura del angulo:
                                                 """);
                int t2 = Integer.parseInt(sc.nextLine());

                int triangulo = (t1 * t2) / 2;
                System.out.println("El Area del rectangulo es: " + triangulo);
            }
        }
    }
}