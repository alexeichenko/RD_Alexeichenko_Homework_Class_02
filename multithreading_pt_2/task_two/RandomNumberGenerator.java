package multithreading_pt_2.task_two;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Генеруємо випадкове число від 1 до 50
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

}
