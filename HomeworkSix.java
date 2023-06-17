public class HomeworkSix {
    public static void main(String[] args) {
        // 1. Створити програму для виведення чисел від 1 до 10
        int a;
        for (a = 0; a <= 10; a++){
            System.out.println(a);
        }
        // 2. Показати всі парні числа в діапазоні від 1 до 100
        int b = 0;
        do {
            System.out.println(b);
            b+=2;
        } while (b <= 100);
        // 3. Знайти факторіал числа 7
        int num = 7;
        int c = 1, fact = 1;
        do {
            fact = fact * c;
            System.out.println(fact);
            c++;
        } while(c <= num);
        System.out.println("Факторіал " + num + " = " + fact);

        // 4. Вивести числа Фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        int f1 = 0, f2 = 1, f3 = 0;
        while (f3 <= 100) {
            System.out.println(f3);
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
