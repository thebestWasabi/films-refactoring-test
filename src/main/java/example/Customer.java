package example;

import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        int frequentRenterPoints = getTotalFrequentRenterPoints();
        for (Rental rental : rentals) {
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }
        // add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned" + frequentRenterPoints + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></ H1><P>\n";
        for (Rental rental : rentals) {
            // show figures for rental rental
            result += rental.getMovie().getTitle() + ": " + rental.getCharge() + "<BR>\n";
        }
        // add footer lines
        result += "<P>You owe <EM>" + getTotalCharge() + "</EM><P>\n";
        result += "On this rental you earned <EM>" + getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPointsIncrement();
        }
        return frequentRenterPoints;
    }

    public String getName() {
        return name;
    }

}
