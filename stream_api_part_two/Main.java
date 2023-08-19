package stream_api_part_two;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Створити лист з 20 прізвищами. Вони повинні повторюватися.
        List<String> surnameList = List.of("Mytytenko", "Kondratenko", "Borysenko", "Stepanenko", "Goncharenko", "Mytytenko", "Kondratenko", "Borysenko", "Stepanenko", "Goncharenko", "Mytytenko", "Kondratenko", "Borysenko", "Stepanenko", "Goncharenko", "Mytytenko", "Kondratenko", "Borysenko", "Stepanenko", "Goncharenko");
        // За допомогою стрім апі перетворити цей лист на мапу. У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
        Map<String, Long> surnamesCount = surnameList.stream()
                .collect(
                        Collectors.groupingBy(
                                surname -> surname, Collectors.counting())
                );
        System.out.println(surnamesCount);
        // 2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
        List<Integer> numbers = new Random().ints(20, 1, 100).boxed().toList();
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Список рандомних чисел: " + numbers);
        System.out.println("Сума рандомних чисел: " + sum);
    }
}
