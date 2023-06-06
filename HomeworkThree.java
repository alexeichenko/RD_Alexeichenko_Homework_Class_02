public class HomeworkThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(b/a);
        System.out.println(a*b);
        System.out.println(a%b);
// autoboxing та unboxing - поки що важкі для розуміння, не впевнений, що роблю правильно
//    autoboxing
        Short sh = 1;
        System.out.println(sh.doubleValue());

        Integer integer = Integer.valueOf("2023");
        System.out.println(integer);
//    unboxing
        Integer value = 100;
        System.out.println(value + 15);
    }
}
