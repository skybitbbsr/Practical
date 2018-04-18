public class InvalidNumberException extends Exception {
    private double number;
    public InvalidNumberException(double number) {
        super("Number should be in between 10 to 40.\nInvalid Number: "+number);
        this.number=number;
    }
    public double getNumber() {
        return number;
    }
}