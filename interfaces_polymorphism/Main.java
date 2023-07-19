package interfaces_polymorphism;

public class Main {
    public static void main(String[] args) {
        Human driver = new Driver();
        Human pilot = new Pilot();
        driver.driving();
        pilot.flying();
        new Driver().driving();
        new Pilot().flying();
    }
}
