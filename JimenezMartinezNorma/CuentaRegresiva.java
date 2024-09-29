import java.util.*;

public class CuentaRegresiva {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int z;

        do {

            System.out.println("\nIngresa \n1: Realizar cuenta regresiva\n0: Cerrar programa");
            z = op.nextInt();

            if (z == 1) {

                System.out.print("\nIngresa el numero con el que quieres empezar: ");
                int a = op.nextInt();
                System.out.println();

                cuentaRegresiva(a);

            }

        } while (z == 1);

    }

    public static void cuentaRegresiva(int x) {

        if (x < 0) {
            
            System.out.println();
            System.out.println("\nSe ha terminado la cuenta regresiva\n");

            return;
        }

        System.out.print(x+" ");

        cuentaRegresiva(--x);

    }

}