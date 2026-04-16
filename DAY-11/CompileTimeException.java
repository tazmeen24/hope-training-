public class CompileTimeException {
    public static void main(String[] args) {
        Thread T=new Thread(()->{
            try{
                System.out.println("Thread sleep");
                Thread.sleep(50000);
                System.out.println("Thread wake");
            } catch(InterruptedException e) {
                System.out.println("Sleep Interrupted");
            }
        });
        T.start();
        try{
            Thread.sleep(4000);
        } catch(Exception e){
            System.out.println();
        }
    }
} 