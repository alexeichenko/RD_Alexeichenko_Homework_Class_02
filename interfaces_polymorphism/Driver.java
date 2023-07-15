package interfaces_polymorphism;

public class Driver extends Human {
    @Override
    public void driving() {
        System.out.println("The engine is started, tank has a fuel, the car is ready to go.");
    }

    @Override
    public void flying() {
    }
}
