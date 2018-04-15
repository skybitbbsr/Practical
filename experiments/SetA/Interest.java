import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double principal;
        double time;
        double interest;
        double n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount:");
        principal = sc.nextDouble();
        System.out.println("Enter Time:");
        time=sc.nextDouble();
        System.out.println("Enter Interest:");
        interest = sc.nextDouble();
        System.out.println("Enter No of Times Interest is Compounded per year:");
        n = sc.nextDouble();

        CompoundInterest compAmt= new CompoundInterest();
        compAmt.compoundInterest(principal,time,interest,n);
    }
}
