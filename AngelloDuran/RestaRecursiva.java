class RestaRecursiva{
    public static void main(String[] args) {
        int a = 22, b = 10;
        System.out.println("La resta recursiva de los numeros 22 - 10 es: " + resta(a, b));
    }
    public static int resta(int a, int b){
        if(b==0){
            return a;
        }
        return a-resta(a-1, b-1);
        
    }
}