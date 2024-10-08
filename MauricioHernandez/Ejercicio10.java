import java.util.Scanner;
class Ejercicio10{
    //método principal
    public static void main(String[] args) {
        //Crear un objeto
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que introduzca un número
        System.out.print("Introduce un número ");
        //El usuario ingresa un número 
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}
