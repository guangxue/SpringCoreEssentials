package SetterDI;

public class MovieListener {
    private MovieFinder movieFinder;
    private String MovieName;

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void setMovieName(String movieName) {
        this.MovieName = movieName;
    }
}
