import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa un numero entero: "); // Pedir al usuario un nuemro entero :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.print("\nIngresa otro numero entero: "); // Pedir al usuario otro nuemro entero :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println("\n" + a + " - " + b + " = " + (a - b) + "\n"); // Imprimir resta de "a" menos "b" :)

    }

}