public class InvalidNumberException extends Exception {    public InvalidNumberException(double number) {        super(String.valueOf(number));    }}