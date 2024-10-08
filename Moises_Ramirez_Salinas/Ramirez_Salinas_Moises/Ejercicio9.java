import java.util.Scanner;
public class Ejercicio9 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);//metodo scanner
    System.out.println("Introduce tu edad: ");//pide tu edad
    int age = sc.nextInt();//guarda tu edad
    if(age >=0 && age <=17){//verifica tu edad
    System.out.println("eres menor de edad");//si es mayor o igual que 0 y menor igual que 17 imprimira que es menor de edad
} else if(age >=18 && age <= 99){//verifica tu edad
     System.out.println("eres mayor de edad"); //si es mayor o igual que 18 y menor igual que 99 imprimira que es mayor de edad
    }
}
}