class SumaRecursiva{
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("La suma recursiva de los numeros 5 + 10 es: " +suma(a, b));
    }
    public static int suma(int a, int b){
        if(b==0){
            return a;
        }
        return a + suma(a, b-1);
        
    }
}