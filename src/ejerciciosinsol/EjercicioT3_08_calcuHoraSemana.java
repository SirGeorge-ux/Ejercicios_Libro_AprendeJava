package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_08_calcuHoraSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float hora;
        System.out.print("Cuantas horas trabajastes la semana: ");
        hora = Float.parseFloat(sc.nextLine());
        float r = hora * 12;
        System.out.print("Sueldo semana: " + r + " Euros \n");
    }

}
