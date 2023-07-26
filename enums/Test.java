package enums;

public class Test {
    public static void main(String[] args) {
        // 1. Створіть клас Test з main методом, в якому ви присвоїте змінній today поточний день тижня використовуючи ваш Enum, а потім виведіть цю змінну.
        DayOfWeek today = DayOfWeek.SATURDAY;
        System.out.println("Today is " + today);
        // 2. Використовуючи Enum DayOfWeek з першого завдання, виведіть всі дні тижня, використовуючи метод values(). Виведіть ordinal число для WEDNESDAY.
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        System.out.println(wednesday.ordinal());
        // 3. Створіть Enum Month, який містить всі місяці року, а також додайте поле days, що показує кількість днів в місяці. Додайте метод getDays(), що повертає кількість днів в місяці. Створіть клас Test з main методом, в якому ви виведете кількість днів в FEBRUARY.
        Month february = Month.FEBRUARY;
        System.out.println(february.getDays());
        // 4. Створіть метод, який приймає DayOfWeek та друкує різні повідомлення залежно від дня тижня, використовуючи switch statement.
        switch (today) {
            case MONDAY -> System.out.println("It's the first day of the week.");
            case TUESDAY -> System.out.println("It's the second day of the week.");
            case WEDNESDAY -> System.out.println("It's the third day of the week.");
            case THURSDAY -> System.out.println("It's the fourth day of the week.");
            case FRIDAY -> System.out.println("It's the fifth day of the week.");
            case SATURDAY -> System.out.println("It's the sixth day of the week.");
            case SUNDAY -> System.out.println("It's the seventh day of the week.");
            default -> System.out.println("Please, choose the day.");
        }
    }
}
