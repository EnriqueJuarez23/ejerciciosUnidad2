import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa un numero entero: "); // Pedir al usuario un nuemro entero :)
        int n = op.nextInt(); // Declarar variable "n" y asignar el valor obtenido :)

        System.out.print("\nNumeros pares: "); // Imprime "Numeros pares" :)

        for (int i = 1; i <= n; i++) { // Condicion para iterar desde el 0 hasta el numero dado :)

            if (i % 2 == 0) { // Valida los numeros para solo imprimir nuemeros pares :)

                System.out.print(i + " "); // Imprime los numeros pares:)

            }

        }

        System.out.println("\n"); // Da un salto de linea :)

    }

}