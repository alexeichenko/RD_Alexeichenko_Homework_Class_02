package reflections_and_annotations;

public class Person {
    private String name;
    @ValidateAge(minAge = 18) // Застосовую анотацію @ValidateAge до поля age і вказую, що мінімальний допустимий вік - 18 років.
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
