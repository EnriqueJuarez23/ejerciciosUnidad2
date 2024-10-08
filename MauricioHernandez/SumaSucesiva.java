import java.util.Scanner;
public class SumaSucesiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Ingresa un número");
        int numero = sc.nextInt();

        if (numero < 1) {
            System.out.println("Ingresa un número distinto.");
            return;
        }

        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i; 
            System.out.println("La suma de: " + i + ": " + suma);
        }

        System.out.println("La suma total " + numero + " es: " + suma);
    }
}
