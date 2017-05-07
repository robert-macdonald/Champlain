package sem2.chap10;

public class NegativePriceException extends Exception {
    public NegativePriceException() {
        super("Error: Negative Price!");
    }
}
