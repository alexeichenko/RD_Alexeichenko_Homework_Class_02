package Generic;

public class Dog implements Animal  {
    @Override
    public void voice() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
