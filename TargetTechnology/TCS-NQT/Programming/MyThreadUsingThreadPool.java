import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadUsingThreadPool {
    

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for(int i=0;i<5;i++){

            pool.execute(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            });

        }

        pool.shutdown();
    }

}
