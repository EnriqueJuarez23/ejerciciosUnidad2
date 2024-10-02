import java.util.Scanner;
class Resta{ 
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingresa un valor");
    int a=sc.nextInt();
    System.out.println("Ingresa otro valor");
    int b=sc.nextInt();
    System.out.println(restar(a, b));
}
public static int restar(int a, int b){
    return a-b;
}
}