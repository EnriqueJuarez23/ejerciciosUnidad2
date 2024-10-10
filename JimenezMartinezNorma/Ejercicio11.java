import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa un numero entero: "); // Pedir al usuario un nuemro entero :)
        int n = op.nextInt(); // Declarar variable "n" y asignar el valor obtenido :)
        System.out.println(); // Da un salto de linea

        int i = 0; // Declarar variable "i" y asignarle el valor donde comenzara la iteracion :)

        while (i <= n) { // Condicion para iterar desde el 0 hasta el numero dado :)

            System.out.print(i + " "); // Imprime la iteracion :)

            i++; // Aumento de uno en uno :)

        }

        System.out.println("\n"); // Da un salto de linea :)

    }

}