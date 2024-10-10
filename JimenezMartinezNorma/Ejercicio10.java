import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa un numero entero: "); // Pedir al usuario un nuemro entero :)
        int n = op.nextInt(); // Declarar variable "n" y asignar el valor obtenido :)
        System.out.println(); // Da un salto de linea :)

        for (int i = 0; i <= n; i++) { // Condicion para iterar desde el 0 hasta el numero dado :)

            System.out.print(i + " "); // Imprime la iteracion :)

        }

        System.out.println("\n"); // Da un salto de linea :)

    }

}