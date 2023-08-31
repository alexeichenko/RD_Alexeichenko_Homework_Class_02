package design_patterns.fabric;

public class Latte implements Coffee {
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
        System.out.println("Додаємо 50мл молока та робимо пінку, використовуючи капучінатор.");
    }

    @Override
    public void blend() {
        System.out.println("До кави додаємо молоко");
    }

    @Override
    public String toString() {
        return "Latte";
    }
}
