package design_patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class MovieHallProxy implements MovieHall{
    // Створюю проксі-клас, який контролюватиме доступ до залу:
    private RealMovieHall realMovieHall;
    private List<String> allowedMovies;
    public MovieHallProxy() {
        realMovieHall = new RealMovieHall();
        allowedMovies = new ArrayList<>();
        allowedMovies.add("Harry Potter");
        allowedMovies.add("Lord of the rings");
        allowedMovies.add("Star wars");
        allowedMovies.add("Avengers");
    }
    @Override
    public void watchMovie(String movie) {
        if (allowedMovies.contains(movie)) {
            realMovieHall.watchMovie(movie);
        } else {
            System.out.println("Вибачте, цього фільму нема в прокаті.");
        }
    }
}
