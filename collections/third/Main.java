package collections.third;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Додаю в арайліст набір українських слів
        ArrayList<String> words = new ArrayList<>();
        words.add(0, "Шапка");
        words.add(1, "Сир");
        words.add(2, "Цибуля");
        words.add(3, "Степлер");
        words.add(4, "Кіно");
        words.add(5, "Випадковий");
        words.add(6, "Пляшка");
        words.add(7, "Сало");
        words.add(8, "Село");
        words.add(9, "Велосипед");
        // Додаю в лінкедліст (для різноманітності) набір перекладів
        LinkedList<String> translate = new LinkedList<>();
        translate.add(0,"Англійською: Cap, Японською: キャップ, Німецькою: Deckel");
        translate.add(1, "Англійською: Cheese, Японською: チーズ, Німецькою: Käse");
        translate.add(2, "Англійською: Onion, Японською: タマネギ, Німецькою: Zwiebel");
        translate.add(3, "Англійською: Stapler, Японською: ホッチキス, Німецькою: Hefter");
        translate.add(4, "Англійською: Cinema, Японською: シネマ, Німецькою: Kino");
        translate.add(5, "Англійською: Random, Японською: ランダム, Німецькою: Willkürlich");
        translate.add(6, "Англійською: Bottle, Японською: ボトル, Німецькою: Flasche");
        translate.add(7, "Англійською: Fat, Японською: 肥満, Німецькою: Fett");
        translate.add(8, "Англійською: Village, Японською: 村, Німецькою: Dorf");
        translate.add(9, "Англійською: Bicycle, Японською: 自転車, Німецькою: Fahrrad");
        // Створюю хєш-мапу, в яку вкладую індекси українських слів та їх переклади:
        HashMap<String, String> wordsMap = new HashMap<>();
        wordsMap.put(words.get(0), translate.get(0));
        wordsMap.put(words.get(1), translate.get(1));
        wordsMap.put(words.get(2), translate.get(2));
        wordsMap.put(words.get(3), translate.get(3));
        wordsMap.put(words.get(4), translate.get(4));
        wordsMap.put(words.get(5), translate.get(5));
        wordsMap.put(words.get(6), translate.get(6));
        wordsMap.put(words.get(7), translate.get(7));
        wordsMap.put(words.get(8), translate.get(8));
        wordsMap.put(words.get(9), translate.get(9));
        // Додаю сканер, який буде сканувати слово, що ввів користувач
        Scanner scanner = new Scanner(System.in);
        // Задаю користувачеві умови, за яких очікується потрібне слово
        System.out.println("Ведіть бажане слово з переліку, щоб отримати переклад на англійську, японську, німецьку:\nШапка, Сир, Цибуля, Степлер, Кіно, Випадковий, Пляшка, Сало, Село, Велосипед");
        // Змінна для вводу слова
        String putTheWord = scanner.next();
        // Змінна для валідації слова, яка переводить весь текст, який ввів користувач в ловеркейс
        String wordValidation = putTheWord.toLowerCase();
        // Світч-кейс для потрібного перекладу
        switch (wordValidation) {
            case "шапка" -> System.out.println(wordsMap.get("Шапка"));
            case "сир" -> System.out.println(wordsMap.get("Сир"));
            case "цибуля" -> System.out.println(wordsMap.get("Цибуля"));
            case "степлер" -> System.out.println(wordsMap.get("Степлер"));
            case "кіно" -> System.out.println(wordsMap.get("Кіно"));
            case "випадковий" -> System.out.println(wordsMap.get("Випадковий"));
            case "пляшка" -> System.out.println(wordsMap.get("Пляшка"));
            case "сало" -> System.out.println(wordsMap.get("Сало"));
            case "село" -> System.out.println(wordsMap.get("Село"));
            case "велосипед" -> System.out.println(wordsMap.get("Велосипед"));
            default -> System.out.println("Ви ввели слово, якого немає в переліку.");
        }
    }
}
