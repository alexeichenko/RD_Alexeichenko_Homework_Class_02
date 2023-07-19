package abstract_and_inner_classes;

public class Professor extends Study{

    public Professor(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    void homework() {
        System.out.println("I can check your homework.");
    }

    @Override
    void mark() {
        System.out.println("I can put mark for your home work.");
    }
}
