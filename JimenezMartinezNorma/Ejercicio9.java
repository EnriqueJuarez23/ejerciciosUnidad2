import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa tu nombre: "); // Pedir nombre al ususario :)
        String n = op.nextLine(); // Declarar variable "n" y asignar el valor obtenido :)

        System.out.print("\nIngresa tu edad: "); // Pedir edad al ususario :)
        int e = op.nextInt(); // Declarar variable "e" y asignar el valor obtenido :)

        if (e >= 18) { // Condicion para verificar si el usaurio es mayor de edad o no :)

            System.out.println("\n" + n + " eres mayor de edad :)\n"); // Imprime si es mayor de edad :)

        } else { // Si la condicion no es verdadera :)

            System.out.println("\n" + n + " eres menor de edad :(\n"); // Imprime si es menor de edad :)

        }

    }

}