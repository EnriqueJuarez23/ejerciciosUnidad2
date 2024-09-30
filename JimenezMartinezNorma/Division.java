import java.util.Scanner;

class Division {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int z;

        do {

            System.out.println("\nIngresa \n1: Realizar division\n0: Cerrar programa");
            z = op.nextInt();

            if (z == 1) {

                System.out.print("\nIngresa el dividendo : ");
                double a = op.nextDouble();

                System.out.print("\nIngresa el divisor: ");
                double b = op.nextDouble();

                double r = division(a, b);
                System.out.println("\n" + a + " / " + b + " = " + r + "\n");

            }

        } while (z == 1);

    }

    public static double division(double x, double y) {

        return x / y;

    }

}