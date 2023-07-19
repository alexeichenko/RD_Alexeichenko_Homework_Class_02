import java.util.Scanner;

public class HomeworkSeven {
    public static void main(String[] args) {
        // 1. Створити метод який повертає куб заданого числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (for cube): ");
        int num = sc.nextInt();
        System.out.println("Cube of the given number is " + cube(num));
        //-------------------------------------------------------------
        // 2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод:
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (for stars): ");
        System.out.println("\nNow you have a " + starsResult() + " stars.");
        // ЗАПИТАННЯ: В рядку виводу: System.out.println("\nNow you have a " + starsResult() + " stars."); Я додав текст, аби вийти з ситуації, коли в мене виводить не тільки зірочки, а й число після них. Я поки що не можу зрозуміти, в чому причина. Чи могли б ви пояснити це в коментарі, або на наступній лекції?
        //-------------------------------------------------------------
        // 3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your symbol: ");
        String text = scan.next();
        System.out.println("Enter your number (for symbol): ");
        int count = scan.nextInt();
        textOut(text, count);
    }
    // 1. Метод який повертає куб заданого числа:
    public static int cube(int num) {
        return num*num*num;
    }
    //-------------------------------------------------------------
    // 2. Метод, який повертає зірочку стільки разів, скільки ввів користувач:
    public static int starsResult() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int starsCount = 0;
        do {
            starsCount++;
            System.out.print("*");
        } while (starsCount < userNumber);
        return starsCount;
    }
    // 3. Метод, який виводить переданий символ стільки разів, скільки передав користувач у метод:
    public static void textOut(String text, int count)
    {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }
}
