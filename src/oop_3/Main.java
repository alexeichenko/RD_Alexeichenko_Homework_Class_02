package src.oop_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Blue", "BMW", 1234);
        Car.carCheck();
        System.out.println(Car.verdict);
    }
}
