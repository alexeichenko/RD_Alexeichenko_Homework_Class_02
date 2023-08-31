package design_patterns.fabric;

public class MakeLatte extends CoffeeShop {
    @Override
    public Coffee makeCoffee() {
        return new Latte();
    }
}
