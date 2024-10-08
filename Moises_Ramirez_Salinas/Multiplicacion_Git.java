
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moises
 */


public class Multiplicacion_Git {
public static void main(String []args) {
Scanner in = new Scanner(System.in);

int numUno = 0;
int numDos = 0;
int resultado = 0;

System.out.println("¿Cual es el primer valor de tu multiplicacion?"); 
numUno = in.nextInt();

System.out.println("¿Cual es el segundo valor de tu multiplicacion?"); 
numDos = in.nextInt();
resultado = numUno * numDos;

System.out.println(resultado);
}
}

