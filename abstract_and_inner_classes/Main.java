package abstract_and_inner_classes;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Sergiy", "Zhuravlev", 27);
        Student student = new Student("Alex", "Alexeichenko", 27);
        professor.mark();
        professor.homework();
        student.mark();
        student.homework();
    }

}
