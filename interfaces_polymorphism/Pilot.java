package interfaces_polymorphism;

public class Pilot extends Human {
    @Override
    public void driving() {
    }

    @Override
    public void flying() {
        System.out.println("The engine is started, tank has a fuel, the plane is ready to go.");
    }
}
