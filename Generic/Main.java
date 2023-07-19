package Generic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Integer and String
        Pair<Integer, String> pair = new Pair<>(10, "apples");
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        // 2. String and Number (щоб показати, що можу ініціалізувати будь-який тип з класу, беру double)
        Pair<String, Number> pairTwo = new Pair<>("P-number", 3.14);
        System.out.println(pairTwo.getFirst() + " " + pairTwo.getSecond());
        // 3. Створюю два масиви різних розмірів: масив інтів та масив стрінгів, передаю їх в дженерік.
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"a", "b", "c", "d"};
        Pair<Integer[], String[]> pairArray = new Pair<>(intArray, strArray);
        System.out.println(Arrays.toString(pairArray.getFirst()) + " " + Arrays.toString(pairArray.getSecond()));
        // 4. Створюю два об'єкти: собаку та кота, які імплементують інтерфейс Animal. Забираю їх в масив і передаю цей масив в дженерік, разом з масивом інтів з минулого прикладу.
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        for (Animal animal : animals) {
            animal.voice();
        }
        Pair<Animal[], Integer[]> pairSecondArray = new Pair<>(animals, intArray);
        System.out.println(Arrays.toString(pairSecondArray.getFirst()) + " " + Arrays.toString(pairSecondArray.getSecond()));
    }
}
