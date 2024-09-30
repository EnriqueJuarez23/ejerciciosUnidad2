import java.util.Scanner;

class Resta {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int z;

        do {

            System.out.println("\nIngresa \n1: Realizar resta\n0: Cerrar programa");
            z = op.nextInt();

            if (z == 1) {

                System.out.print("\nIngresa un numero: ");
                int a = op.nextInt();

                System.out.print("\nIngresa otro numero: ");
                int b = op.nextInt();

                int r = resta(a, b);
                System.out.println("\n" + a + " - " + b + " = " + r + "\n");

            }

        } while (z == 1);

    }

    public static int resta(int x, int y) {

        return x - y;

    }

}