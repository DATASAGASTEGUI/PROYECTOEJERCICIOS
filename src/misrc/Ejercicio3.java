package misrc;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        System.out.println("EJERCICIO 3");
        System.out.println("===========");
        System.out.print("Ingrese dato positivo? ");
        dato = sc.nextInt();
        System.out.println("Evaluar Dato: " + evaluarDato(dato));

    }

    public static String evaluarDato(int dato) {
        if (dato > 0) {
            if (dato % 2 == 0) {
                return "Par";
            } else {
                return "Impar";
            }
        } else {
            return "Dato No Valido";
        }
    }
}
