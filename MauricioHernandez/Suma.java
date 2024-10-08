import java.util.Scanner;
class Suma{ 
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingresa un valor");
    int a=sc.nextInt();
    System.out.println("Ingresa otro valor");
    int b=sc.nextInt();
    System.out.println(sumar (a, b));
}
public static int sumar (int a, int b){
    return a+b;
}
}