package Generic;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meow.");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
