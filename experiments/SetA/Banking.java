import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        double balance = 0.0;
        BankingCalculate bc=new BankingCalculate();
        int ch = 2;
        Scanner s = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String name;
        int accNo;
        double amount=0.0;
        System.out.println("Welcome to Banking System!!");
        do  {
            System.out.println("1: Open Account 2: Deposit 3: Withdraw 4:Quit");
            System.out.print("Enter choice [1-4]: ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a customer name");
                    name = str.next();
                    System.out.println("Enter a opening balance");
                    amount = s.nextDouble();
                    System.out.println("Account was created. Account Number is: "+bc.openNewAccount(name, amount));
                    break;
                case 2:
                    System.out.println("Enter a account number");
                    accNo = str.nextInt();
                    System.out.println("Enter a deposit amount");
                    amount = s.nextDouble();
                    bc.depositTo(accNo, amount);
                    break;
                case 3:
                    System.out.println("Enter a account number");
                    accNo = str.nextInt();
                    System.out.println("Enter a withdraw amount");
                    amount = s.nextDouble();
                    bc.withdrawFrom(accNo, amount);
                    break;
                case 4:
                    break;
                }
            }
            while(ch!=4);
        }

    }

