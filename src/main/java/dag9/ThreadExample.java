package dag9;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
