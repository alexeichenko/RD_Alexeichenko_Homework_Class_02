package multithreading.first;

public class MyThreads extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Потік " + Thread.currentThread().getName() + ": " + i);
        }
    }
}
