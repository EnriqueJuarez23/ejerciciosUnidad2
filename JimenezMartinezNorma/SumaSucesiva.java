import java.util.*;

public class SumaSucesiva {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int z;

        do {

            System.out.println("\nIngresa \n1: Realizar suma sucesiva\n0: Cerrar programa");
            z = op.nextInt();

            if (z == 1) {

                System.out.print("\nIngresa un numero: ");
                int a = op.nextInt();

                sumaSucesiva(a);

            }

        } while (z == 1);

    }

    public static void sumaSucesiva(int x) {

        int r = 0;

        for (int i = 0; i <= x; i++) {

            r += i;

        }

        System.out.println("\nLa suma sucesiva de " + x + " es " + r + "\n");

    }
}