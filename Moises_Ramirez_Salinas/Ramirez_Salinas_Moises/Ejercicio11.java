import java.util.Scanner;

class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:"); // pide un número
        int numero = sc.nextInt(); // se guarda el número anterior
        System.out.println("Números del 0 al " + numero); // se mostrarán los números del 0 al número que ingrese

        int i = 0; // inicializamos la variable i
        while (i <= numero) { // condición while
            System.out.println(i); // imprime el valor de i
            i++; // incremento i 
        }
    }
}
