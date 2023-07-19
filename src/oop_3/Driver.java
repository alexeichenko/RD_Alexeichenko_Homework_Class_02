package src.oop_3;

public class Driver extends Person {

    public Driver(String name, String surname, String sex, int age) {
        super(name, surname, sex, age);
        super.setRole("2. Водій:");
        showRole();
        showLicense();
    }
    private void showRole() {
        System.out.println(super.getRole());
    }
    private static void showLicense() {
        System.out.println("3. Ось мої водійські права.");
    }
}
