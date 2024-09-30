class MultiplicacionRecursiva{
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("La multi plicacion recursiva de los numero 5 * 10 es: " +multiplicacion(a, b));
    }
    public static int multiplicacion(int a, int b){
        if(b==0){
            return a;
        }
        return a*multiplicacion(a, b-1);
        
    }
}