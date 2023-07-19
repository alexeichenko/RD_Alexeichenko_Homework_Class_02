package src.oop_02;

public class Truck extends Car{
    String type = "truck";
    @Override
    public String toString() {
        return "Type of this auto: " + type;
    }
}
