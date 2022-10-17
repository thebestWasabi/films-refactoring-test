package example;

import static example.Movie.CHILDREN;

public class ChildrenPrice extends Price {

    public ChildrenPrice() {
        super(CHILDREN);
    }

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) {
            return 1.5 + (daysRented - 3) * 1.5;
        }
        return 1.5;
    }
}
