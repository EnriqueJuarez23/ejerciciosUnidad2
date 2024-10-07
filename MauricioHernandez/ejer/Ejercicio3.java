import java.util.Scanner;
public class Ejercicio3{
    //método principal
    public static void main(String[] args) {
         //Crear un objeto
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que introduzca el su nombre
        System.out.print("Introduce tu nombre ");
         //El usuario ingresa su nombre
        String a = sc.nextLine();
        //Crear cadena
        System.out.println("Bienvenido " + a);
    }
}
