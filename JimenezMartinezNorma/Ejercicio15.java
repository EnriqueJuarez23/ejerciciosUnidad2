import java.util.*;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        int n; // Declarar variable "n" :)

        do {

            System.out.print("\nIngresa un numero entero positivo: "); // Pedir al usuario un nuemro entero :)
            n = op.nextInt(); // Asignar el valor obtenido a "n" :)

            if (n <= 0) { // Condicion para verificar si el numero es menor a 0 :)

                System.out.println("Error"); // Imprime "error" :)

            }

        } while (n <= 0); // Si la condicion es correcta vuelve a pedir el numero :)

        if (n % 2 == 0) { // Validad si el numero ingresado es par :)

            System.out.println("\n" + n + " es un numero par\n"); // Imprime que el numero ingresado es par :)

        } else { // Si la condicion no es verdadera :)

            System.out.println("\n" + n + " es un numero impar\n"); // Imprime que el numero ingresado es impar :)

        }

    }

}