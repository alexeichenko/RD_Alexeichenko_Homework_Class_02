package src.oop_3;

public class Passenger extends Person {
    public Passenger(String name, String surname, String sex, int age) {
        super(name, surname, sex, age);
        super.setRole("4. Пасажир:");
        showRole();
        showLicense();
    }
    private void showRole() {
        System.out.println(super.getRole());
    }
    private static void showLicense() {
        System.out.println("5. В мене немає водійського посвідчення. Ось мої документи.");
    }
}
