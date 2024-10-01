import java.util.Scanner;

class CuentaRegresiva{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de inicio: ");
        int x = sc.nextInt();
        System.out.println("--------");
        cuentaRegresiva(x);
    }

    public static void cuentaRegresiva(int a) {
        if (a < 0) {
            System.out.println("Termino el conteo");
            return;
        }
        System.out.println(a);
        cuentaRegresiva(--a);
    }
}