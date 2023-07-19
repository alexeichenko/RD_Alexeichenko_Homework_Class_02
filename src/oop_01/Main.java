package src.oop_01;

public class Main {
    public static void main(String[] args) {
        // 1. Створення об'єкту Студент
        Student student = new Student("Alex", "Alexeichenko", 27);
        System.out.println(student.getName() + '\t' + student.getSurname() + '\t' + student.getAge());
        // 2. Створення об'єкту Професор
        Professor professor = new Professor("Serhiy", "Zhuravlev", 27);
        System.out.println(professor.getName() + '\t' + professor.getSurname() + '\t' + professor.getAge());
        // 3. Задіяння класу студента в класі професора
        String currentStudentInfo = professor.currentStudent();
        System.out.println(currentStudentInfo);
    }
}
