package design_patterns.fabric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Робимо латте: ");
        CoffeeShop latte = new MakeLatte();
        Coffee makeLatte = latte.makeCoffee();
        makeLatte.prepare();
        makeLatte.cook();
        makeLatte.addMild();
        makeLatte.blend();
        System.out.println("Ви отримали каву: " + makeLatte+'\n');
        System.out.println("Робимо еспрессо");
        CoffeeShop espresso = new MakeEspresso();
        Coffee makeEspresso = espresso.makeCoffee();
        makeEspresso.prepare();
        makeEspresso.cook();
        makeEspresso.addMild();
        makeEspresso.blend();
        System.out.println("Ви отримали каву: " + makeEspresso);
    }
}
