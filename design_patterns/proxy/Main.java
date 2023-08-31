package design_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        // Реалізація Proxy
        // Використовую проксі для контролю доступу до залу
        MovieHall movieHall = new MovieHallProxy();
        movieHall.watchMovie("Harry Potter");
        movieHall.watchMovie("Cinderella");

    }
}
