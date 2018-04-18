public class Ope {
    private double number;
    private double sum=0.0;

    public double setNumber(double number)throws InvalidNumberException {
        if (number >= 10 && number <= 40) {
            this.sum = sum + number;
            return sum;
            }
        else
            throw new InvalidNumberException(number);
    }
}
