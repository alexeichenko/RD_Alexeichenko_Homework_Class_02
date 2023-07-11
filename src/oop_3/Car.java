package src.oop_3;

public class Car extends People {

    static {
        System.out.println("1. Автомобіль зупиняють на дорозі.");
    }

    {
        System.out.println("6. Інспектор хоче отримати інформацію про пасажирів.");
    }
    public static void carCheck() {
        System.out.println("8. Інспектор перевіряє порушення.");
    }

    public static String verdict = carAnalyse();

    private static String carAnalyse() {
        return "9. Порушень не виявлено. Автомобіль може продовжити рух.";
    }
    public Car(String color, String mark, int number) {
        people();
    }
}
