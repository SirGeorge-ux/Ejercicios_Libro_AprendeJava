package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_02_03_converEuro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Selecciona la opcion que quieres convertir: \n [1] Euro -> Pst \n [2] Pst -> Euro  \n");

        int opcion = Integer.parseInt(sc.nextLine());

        if (opcion == 1) {

            System.out.print("Introduce la cantidad en EUROS a transformar a PESETAS: ");
            double euro = Double.parseDouble(sc.nextLine());

            double r = euro * 166.386;
            String rt = String.format("%.2f", r);

            System.out.printf(rt + " pesetas son " + euro + " euros.");

        } else {
            System.out.print("Introduce la cantidad en PESETAS a transformar a EUROS: ");
            double pst = Double.parseDouble(sc.nextLine());

            double r = pst / 166.386;
            String rt = String.format("%.2f", r);
            System.out.printf(rt + " euros son " + pst + " pesetas.");
        }
    }
}
