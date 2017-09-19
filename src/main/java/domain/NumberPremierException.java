package domain;

public class NumberPremierException extends RuntimeException {
    public NumberPremierException() {
        super ("Number should be positive ");
    }
}
