import java.util.Scanner;
class Ejercicio11{
    //método principal
    public static void main(String[] args) {
        //Crear un objeto
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que introduzca un número
        System.out.print("Introduce un número ");
        //El usuario ingresa un número 
        int n = sc.nextInt();
        //inicia condicion 
        int a=0;
        //Condicion
        while (a<=n){
            System.out.println(a);
            //Incremento 
            a++;
        }
    }
}
