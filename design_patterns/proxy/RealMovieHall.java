package design_patterns.proxy;

public class RealMovieHall implements MovieHall{
    @Override
    public void watchMovie(String movie) {
        System.out.println("Ви придбали квиток на фільм: " + movie);
        // Імплементую інтерфейс, який представляє зал для фільмів в наш реальний зал.
    }
}
