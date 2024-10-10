import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa el dividendo: "); // Pedir al usuario un nuemro :)
        double a = op.nextDouble(); // Declarar variable "a" y asignar el valor obtenido :)

        System.out.print("\nIngresa el divisor: "); // Pedir al usuario otro nuemro :)
        double b = op.nextDouble(); // Declarar variable "b" y asignar el valor obtenido :)

        System.out.println("\n" + a + " / " + b + " = " + (a / b) + "\n"); // Imprimir division de "a" sobre "b" :)

    }

}