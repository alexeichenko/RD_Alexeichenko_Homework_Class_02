package src.oop_02;

public class Vehicle extends Car {
    String type = "vehicle";
    @Override
    public String toString() {
        return "Type of this auto: " + type;
    }
}
