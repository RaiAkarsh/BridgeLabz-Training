public class PeakFareCalculator implements FareCalculator {

    public double calculateFare(double distance) {
        return distance * 15; // Peak price
    }
}
