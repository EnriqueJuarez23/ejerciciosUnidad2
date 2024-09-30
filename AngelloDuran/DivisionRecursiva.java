class DivisionRecursiva{
    public static void main(String[] args) {
            int a = 10000, b = 2000;
            System.out.println("La division con recursividad es: "+ division(a, b));
        }
        public static int division(int a, int b){
            if(a<b){
                return 0;
            }
            return 1+division(a - b,b);
            
        }
    }
