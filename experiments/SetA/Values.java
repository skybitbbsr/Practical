import java.util.Scanner;public class Values {    double p;    double r;    double t;    public void setValues() {        Scanner sc = new Scanner(System.in);        System.out.println("Enter Principal");        p = sc.nextDouble();        System.out.println("Enter Rate Of Interest");        r = sc.nextDouble();        System.out.println("Enter Time");        t = sc.nextDouble();    }}