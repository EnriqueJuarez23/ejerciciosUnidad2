import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.println("\n---Modulo o resto de una division--- ");

        System.out.print("\nIngresa el dividendo: "); // Pedir al usuario un nuemro :)
        int a = op.nextInt(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.print("\nIngresa el divisor: "); // Pedir al usuario otro nuemro :)
        int b = op.nextInt(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println("\n" + a + " % " + b + " = " + (a % b) + "\n"); // Imprimir modulo de "a" sobre "b" :)

    }

}