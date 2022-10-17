package example;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getCharge() {
        return getMovie().getPrice().getCharge(getDaysRented());
    }

    int getFrequentRenterPointsIncrement() {
        return getMovie().getPrice().frequentRenter(getDaysRented());
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

}
