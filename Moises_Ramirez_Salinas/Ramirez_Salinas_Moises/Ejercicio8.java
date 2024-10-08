import java.util.Scanner;
public class Ejercicio8 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);//metodo scanner
    System.out.println("Ingresa un numero");
    int a = sc.nextInt();//guarda el primer valor
    System.out.println("Ingresa un segundo numero");
    int b = sc.nextInt();//guarda el segundo valor
    System.out.println(a%b); //imprime el modulo de los valores de a y b
    }
    
}
