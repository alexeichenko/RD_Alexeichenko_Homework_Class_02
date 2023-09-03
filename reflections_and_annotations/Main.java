package reflections_and_annotations;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 26);
        Person oleksiy = new Person("Oleksiy", 17);

        try {
            Validator.validate(ivan);
            System.out.println("Особі " + ivan + " Більше 18 років. Дайте цьому джентельмену пачку дзигарів.");
        } catch (IllegalAccessException e) {
            System.out.println(ivan + " Молодше 18-ти років. Йому не можна курити.");
            e.printStackTrace();
        }

        try {
            Validator.validate(oleksiy);
            System.out.println("Особі " + oleksiy + "Більше 18 років. Дайте цьому джентельмену пачку дзигарів.");
        } catch (IllegalAccessException e) {
            System.out.println(oleksiy + "Молодше 18-ти років. Йому не можна курити");
            e.printStackTrace();
        }
    }
}
