package abstract_and_inner_classes;

public class Student extends Study {

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    void homework() {
        System.out.println("I do homework, which the teacher will check later.");
    }

    @Override
    void mark() {
        System.out.println("I can see the grades given to me by the teacher.");
    }
}
