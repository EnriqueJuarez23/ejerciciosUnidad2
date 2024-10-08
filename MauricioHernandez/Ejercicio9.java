import java.util.Scanner;
class Ejercicio9{
    //método principal
    public static void main(String[] args) {
        //Crear un objeto
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que introduzca su nombre
        System.out.print("Ingresa tu nombre");
        //El usuario ingresa su nombre 
        String name1 = sc.nextLine();
        // Pedir al usuario que introduzca su edad
        System.out.print("Introduce un número ");
        //El usuario ingresa su edad
        int num1 = sc.nextInt();
        //Poner condiciones 
        if (num1 >= 18){
        //Imprime si cumpe la condicion 
        System.out.println("Eres mayor de edad");
        } else {
        //Imprime si no cumple condicion 
        System.out.println("Eres menor de edad");
        }
    
    }
}
