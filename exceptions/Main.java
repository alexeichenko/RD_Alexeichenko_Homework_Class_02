package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskOne() {
        // Запросити з консолі число й огорнути цей функціонал у блоки обробки винятків.
        // При вводі замість числа літер - показувати повідомлення про помилку на консоль.
        // За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок.
        Scanner scanner = null;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Введіть число: ");
                int num = scanner.nextInt();
                System.out.println("Ви ввели число: " + num);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введене значення не є числом. Спробуйте знову.");
                scanner.nextLine();
            }
        }
        if (scanner != null) {
            scanner.close();
        }
    }

    private static void taskTwo() {
        // Створити виняток який викидається коли число менше нуля. Створити функцію, яка приймає число і повертає його квадрат. Якщо число буде менше нуля - то викинути створений виняток.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть додатнє число, щоб отримати квадрат цього числа: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new CustomNumberException("Число не може бути від'ємне.", 1);
            }
            int numberSquare = number * number;
            System.out.println("Квадрат цього числа: " + numberSquare);
        } catch (CustomNumberException e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }
}
