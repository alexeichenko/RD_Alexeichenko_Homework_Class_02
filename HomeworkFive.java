import java.util.Scanner;

public class HomeworkFive {
    public static void main(String[] args) {
        // Спробував реалізувати в одній програмі пошук меншого і більшого числа з двох:
        Scanner enterNumber = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int e = enterNumber.nextInt();
        System.out.print("Введіть друге число: ");
        int f = enterNumber.nextInt();
        if (e == f) {
            System.out.println("Ці числа рівні між собою");
        } else if (e > f) {
            System.out.println("Перше число більше, ніж друге число");
        } else {
            System.out.println("Друге число більше, ніж перше");
        }
        System.out.println("Вітаю, ви знайшли правильну відповідь");

        // Реалізація за допомогою тренарного оператора:
        Scanner trenaryNumber = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int g = trenaryNumber.nextInt();
        System.out.print("Введіть друге число: ");
        int h = trenaryNumber.nextInt();
        System.out.println(g > h ? "Перше число більше" : "Друге число більше");
        System.out.println("Вітаю, ви знайшли правильну відповідь");
        // Але не поки не розумію як додати перевірку на рівність, якщо два числа однакові.

        //Перевірка числа на парність (гуглив, що таке парні числа):
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше число: ");
        int k = scanner.nextInt();
        if (k % 2 == 0) {
            System.out.println("Це число парне");
        } else {
            System.out.println("Це число не парне");
        }
        System.out.println("Вітаю, ви дізнались відповідь");
    }

}
