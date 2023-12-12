package misrc;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        System.out.println("EJERCICIO 2");
        System.out.println("===========");
        System.out.print("Ingrese nota [0-20]? ");
        nota = sc.nextDouble();
        System.out.println("Evaluar Nota: " + evaluarNota(nota));
    }
    
    public static String evaluarNota(double nota) {
        if(nota >= 0 && nota <= 20) {
           if(nota > 10.5) {
               return "Aprobado";
           }else {
               return "Desaprobado";
           }
        }else {
            return "Nota No Valida";
        }
    }

}
