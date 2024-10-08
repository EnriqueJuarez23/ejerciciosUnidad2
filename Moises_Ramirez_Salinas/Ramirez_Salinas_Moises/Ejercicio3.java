import java.util.Scanner;//scanner para valores de ususario
public class Ejercicio3 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in); //metodo scanner
     System.out.println("Ingresa tu nombre");//pide el nombre al usuario
     String nombre= sc.nextLine();//guarda la variable y resultado
     System.out.println("Tu nombre es:" + nombre); //imprime mi resultado
    }
    
}