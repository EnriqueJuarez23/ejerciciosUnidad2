import java.util.Scanner;

class Multiplicacion {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int z;

        do {

            System.out.println("\nIngresa \n1: Realizar multiplicacion\n0: Cerrar programa");
            z = op.nextInt();

            if (z == 1) {

                System.out.print("\nIngresa un numero: ");
                int a = op.nextInt();

                System.out.print("\nIngresa otro numero: ");
                int b = op.nextInt();

                int r = mult(a, b);
                System.out.println("\n" + a + " * " + b + " = " + r + "\n");

            }

        } while (z == 1);

    }

    public static int mult(int x, int y) {

        return x * y;

    }

}