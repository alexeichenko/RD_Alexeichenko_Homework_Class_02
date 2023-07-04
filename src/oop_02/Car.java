package src.oop_02;

public class Car {
    String type = "car";

    void print() {
        System.out.println(this);
    }
    public String toString() {
        return "Type of this auto: " + type;
    }
}
