/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moises
 */
import java.util.Scanner;
public class Cuenta_regresiva_Git {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int Num = 0;
System.out.println("Introduce el valor el cual quieres hacer una cuenta regresiva."); 
 Num = in.nextInt();

while (Num >= 0) {
System.out.println(Num);
Num -= 1;
}
}
}