package dag9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        new Thread(new RunnableExample()).start();
        System.out.println(Thread.currentThread().getId());
        new ThreadExample().run();

        ExecutorService es = Executors.newSingleThreadExecutor();
        //this can be forced to s.d.
//        es.execute(() -> {
//            try {
//                Thread.sleep(100000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        es.execute(() -> {
            for(;;){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
                System.out.printf("bla");
            }
        });
        es.shutdownNow();


    }
}
