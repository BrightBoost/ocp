package dag9;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getId());
        new Thread(new RunnableExample()).start();
        System.out.println(Thread.currentThread().getId());
        new ThreadExample().run();
    }
}
