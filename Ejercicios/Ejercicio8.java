import java.util.Scanner;
class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            double a = sc.nextDouble();
            System.out.println("Ingresa el segundo numero: ");
            double b = sc.nextDouble();
            System.out.println(a%b);
    }
}