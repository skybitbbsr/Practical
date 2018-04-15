
public class CompoundInterest {
    public void compoundInterest(double p, double t,double r,double n){
        double a;

        a = p * Math.pow(1 + (r / n), n * t);

        double interest = a - p;
        System.out.println("Compound Interest is " + interest);
        System.out.println("Amount is " + a);

    }
}