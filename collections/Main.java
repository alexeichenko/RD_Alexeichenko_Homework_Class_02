package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 1.1 Створити програму для збереження списку чисел з 2 000 000 елементів:
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 2_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        // 1.2 Створити програму для збереження списку чисел з 10 елементів:
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        // 2. Зберегти у колекції список студентів:
        Student oleksiy = new Student("Alex", "A.", 27);
        Student andrii = new Student("Andrii", "G.", 27);
        Student nick = new Student("Nick", "P.", 28);
        // Реалізація через LinkedList
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(oleksiy);
        studentLinkedList.add(andrii);
        studentLinkedList.add(nick);
        System.out.println(studentLinkedList);
        // Реалізація через масив, доданий в колекцію ArrayList
        Student[] studentsArray = new Student[3];
        studentsArray[0] = oleksiy;
        studentsArray[1] = andrii;
        studentsArray[2] = nick;
        ArrayList<Student> studentsList = new ArrayList<>();
        for (Student student : studentsArray) {
            studentsList.add(student);
        }
        System.out.println(studentsList);
    }
}
