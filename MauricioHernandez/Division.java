import java.util.Scanner;
class Division{ 
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingresa un valor");
    int a=sc.nextInt();
    System.out.println("Ingresa otro valor");
    int b=sc.nextInt();
    System.out.println(dividir(a, b));
}
public static int dividir (int a, int b){
    return a/b;
}
}