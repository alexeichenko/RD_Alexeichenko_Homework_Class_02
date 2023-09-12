package multithreading_pt_2.task_one;

public class Main {
    public static void main(String[] args) {
        NumberGeneratorThread thread = new NumberGeneratorThread();
        thread.start(); // Запускаємо потік

        // Чекаємо, поки потік завершить свою роботу
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Головний потік завершує роботу.");
    }
}
