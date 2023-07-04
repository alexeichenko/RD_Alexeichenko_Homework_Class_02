package src.oop_01;

public class Professor {

    private String name;
    private String surname;
    private int age;

    public Professor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student student = new Student("Alex", "Alexeichenko", 27);

    String currentStudent() {
        return student.getName() + '\t' + student.getSurname() + " навчається на курсі " + this.name + '\t' + this.surname;
    }
}
