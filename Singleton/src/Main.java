import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++) {
            exec.submit(new Runnable() {
                public void run() {
                    Singleton instance = Singleton.getSingletonInstance();
                }
            });
        }
        exec.shutdown();
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }
}
