import java.util.Scanner;
 class Ejercicio10 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero:");//pide un numero
        int numero = sc.nextInt();//se guarda el numero anterior 
        System.out.println("Numeros del 0 al "+ numero ); // se mostraran los numeros del 0 al numero que ingrese 
        for (int i = 0; i<= numero;i++){//bucle for el cual aumenta de 1 en 1
            System.out.println(i);
        }
    }
}
        