package multithreading_pt_2.task_two;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 10; // Кількість потоків в пулі
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        try {
            for (int i = 0; i < numberOfThreads; i++) {
                // Створюємо та запускаємо callable потік
                Callable<Integer> callable = new RandomNumberGenerator();
                Future<Integer> future = executorService.submit(callable);
                // Отримуємо результат випадкового числа і виводимо його
                int randomNumber = future.get();
                System.out.println("Отримано випадкове число: " + randomNumber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown(); // Завершуємо роботу пула потоків
        }
    }
}
