package src.oop_3;

public class People {
    Driver driver = new Driver("Alex", "Alexeichenko","male", 27);
    Passenger passenger = new Passenger("Katherine", "Alexeichenko", "female", 26);

    public void people(){
        System.out.println("7. Інспектор перевіряє документи людей, що знаходяться в автомобілі:" + "\n" + driver + "\n" + passenger);
    }
}
