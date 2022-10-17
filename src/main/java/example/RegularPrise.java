package example;

import static example.Movie.REGULAR;

public class RegularPrise extends Price {

    public RegularPrise() {
        super(REGULAR);
    }

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 2) {
            return 2 + (daysRented - 2) * 1.5;
        }
        return 2;
    }

}
