package design_patterns.fabric;

public class MakeEspresso extends CoffeeShop{
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }
}
