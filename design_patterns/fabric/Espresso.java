package design_patterns.fabric;

public class Espresso implements Coffee{

    @Override
    public void prepare() {
        System.out.println("Заготовлюємо сорт кави.");
    }
    @Override
    public void cook() {
        System.out.println("Варимо каву в кавомашині.");
    }
    @Override
    public void addMild() {
        System.out.println("До еспрессо не додається молоко.");
    }
    @Override
    public void blend() {
        System.out.println("Кава не змішується і подається одразу в чашці, або стаканчику.");
    }

    @Override
    public String toString() {
        return "Espresso";
    }
}
