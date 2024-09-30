
class CuentaRegresiva {
    public static void main(String[] args) {
        System.out.println("==============CUENTA REGRESIVA 10seg==============");
        
        Thread contador = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int inicio = 10; inicio >= 0; inicio--) {
                    System.out.println(inicio + " ");
                    try { 
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        System.out.println("Error: " + e);
                    }
                }
                System.out.println("\n¡Finalización! :)");
            }
        });
        
        contador.start();
    }
}
