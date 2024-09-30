/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moises
 */
import java.util.Scanner;
public class Numeros_sucesivos_Git {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int Num = 0;
int Num2 =100;
System.out.println("Introduce un valor del 0 - 100."); 
 Num = in.nextInt();

while (Num <= Num2) {
System.out.println("Numero siguiente:" + Num);
Num += 1;
}
}
}

