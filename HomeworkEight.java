import java.util.Arrays;
import java.util.Random;

public class HomeworkEight {
    private static final Random random = new Random();
    private final static int range = 10;
    public static void main(String[] args) {
        // 1. Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами.
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
        // 2. Вивести його на консоль
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int a : array) {
            //3. Знайти мінімальне значення
            if (array[a] < min) {
                min = array[a];
            }
            // 4. Знайти максимальне значення
            if (array[a] > max) {
                max = array[a];
            }
        }
        System.out.println("Мінімальне число масиву: " + min);
        System.out.println("Максимальне число масиву: " + max);
        // 5. Знайти середнє значення
        int sum = 0;
        for (int b : array) {
            sum += b;
        }
        double average = (double) sum / array.length;
        System.out.println("Середнє значення масиву: " + average);
        // 6. Знайти суму всіх елементів
        for (int j : array) {
            sum += j;
        }
        System.out.println("Сума чисел масиву: " + sum);
    }
}