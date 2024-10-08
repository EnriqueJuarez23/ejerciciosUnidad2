import java.util.Scanner;
class Ejercicio4{
     //método principal
    public static void main(String[] args) {
        //Crear un objeto
        Scanner sc = new Scanner(System.in);
         //Pedir al usuario que introduzca el primer número
        System.out.print("Introduce un número ");
         //El usuario ingresa el primer número
        int num1 = sc.nextInt();
         // Pedir al usuario que introduzca el segundo número
        System.out.print("Introduce otro número ");
         //El usuario ingresa el segundo número 
        int num2 = sc.nextInt();
        //Imprimir el resultado
        System.out.println(num1 + num2);
    }
}
