class SumaSucesiva{
    public static void main(String[] args) {
        int sucesion=100;
        System.out.println("la suma sucesiva del 1 al " + sucesion + " es:" + sumasucesiva(sucesion));
        
    }
    public static int sumasucesiva(int numero){
        if(numero==1){
            return 1;
        }
        return numero + sumasucesiva(numero - 1);
    }
}