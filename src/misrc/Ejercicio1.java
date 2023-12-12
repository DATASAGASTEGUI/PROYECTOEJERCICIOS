package misrc;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;
        System.out.println("EJERCICIO 1");
        System.out.println("===========");
        System.out.print("Ingrese Sueldo? ");
        sueldo = sc.nextDouble();
        System.out.printf("Nuevo Sueldo: %8.2f", calculo(sueldo));
    } // FIN MAIN

    public static double calculo(double sueldo) {
        if (sueldo < 1000) {
            sueldo = sueldo * 1.17;
        } else {
            sueldo = sueldo * 1.12;
        }
        return sueldo;
    }
} // FIN CLASE
