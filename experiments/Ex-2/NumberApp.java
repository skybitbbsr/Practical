import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        Ope op = new Ope();
        double sum=0;
        Scanner sc=new Scanner(System.in);
        double number=1;
        System.out.println("Enter Numbers between 10 to 40 to be added...");
        while(number!=0) {
            try {
                number=sc.nextDouble();
                sum=op.setNumber(number);

            }catch (InvalidNumberException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Sum= "+sum);
    }
}
