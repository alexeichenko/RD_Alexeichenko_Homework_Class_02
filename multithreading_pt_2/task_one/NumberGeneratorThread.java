package multithreading_pt_2.task_one;

public class NumberGeneratorThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    // Якщо число 5, завершуємо роботу потоку
                    System.out.println("Потік завершує роботу. Згенеровано число 5.");
                    break;
                }

                System.out.println("Згенеровано число: " + i);
                Thread.sleep(1000); // Затримка 1 секунда між числами
            }
        } catch (InterruptedException e) {
            System.out.println("Потік був перерваний.");
        }
    }
}
