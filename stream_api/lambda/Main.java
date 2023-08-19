package stream_api.lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Stepanenko",25.5));
        studentList.add(new Student("Akylenko", 30.0));
        studentList.add(new Student("Makarenko", 27.4));
        // Вивожу оригінальний лист:
        System.out.println(studentList);
        // Створюємо компаратори для сортування по Прізвищу та Середньому балу
        Comparator<Student> compareSurname = Comparator.comparing(Student::getSurname);
        Comparator<Student> compareScore = Comparator.comparing(Student::getAverageScore);
        // Відсортовуємо список студентів за Прізвищем та виводимо на консоль
        studentList.sort(compareSurname);
        System.out.println("Список студентів за Прізвищем:");
        studentList.forEach(System.out::println);
        // Відсортовуємо список студентів за Середнім балом та виводимо на консоль, додав реверс, щоб в порядку зростання було.
        studentList.sort(compareScore.reversed());
        System.out.println("\nСписок студентів за Середнім балом:");
        studentList.forEach(System.out::println);
    }
}
