import java.util.Scanner;
class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:"); // pide un número
        int numero = sc.nextInt(); // se guarda el número anterior
        System.out.println("Números pares del 0 al " + numero); // se mostrarán los números pares del 0 al número que ingrese

        int i = 0; // inicializamos la variable i
        do {
            if (i % 2 == 0) { // si el número es par (i divisible por 2)
                System.out.println(i); // se imprime el valor de i
            }
            i++; // incrementamos i
             } 
             while (i <= numero); // condición del bucle
    }

}
