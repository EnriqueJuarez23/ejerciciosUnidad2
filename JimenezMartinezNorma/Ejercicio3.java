import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in); // Crear objeto Scanner para leer la entrada del usuario :)

        System.out.print("\nIngresa tu nombre: "); // Pedir nombre al ususario :)
        String n = op.nextLine(); // Declarar variable "n" y asignar el valor obtenido :)

        System.out.println("\nBienvenid@ " + n + "!\n"); /* Imprimir "Bienvenido" y concatenar la variable "n" :) */

    }

}