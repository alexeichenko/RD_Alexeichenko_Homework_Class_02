package multithreading.first;

public class Main {
    public static void main(String[] args) {
        MyThreads firstThread = new MyThreads();
        firstThread.setName("first thread");
        MyThreads secondThread = new MyThreads();
        secondThread.setName("second stream");
        runThreads(firstThread, secondThread);
    }

    private static void runThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
