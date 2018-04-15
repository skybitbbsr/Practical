

public class BankingPerson {

    private int accNo;
    private String name;
    private double balance;
    private double[] transactions;
    private int numOfTransactions;
    private static int noOfAccounts = 0;

    public String getAccountInfo() {
        return "Account number: " + accNo + "\nCustomer Name: " + name + "\nBalance:" + balance + "\n";
    }

    public int getTransactionInfo(int n) {
        numOfTransactions = n;
        return n;
    }

    public BankingPerson(String abc, double xyz) {
        name = abc;
        balance = xyz;
        noOfAccounts++;
        accNo = noOfAccounts;
        transactions = new double[100];
        transactions[0] = balance;
        numOfTransactions = 1;
    }

    public int getAccountNum() {
        return accNo;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount to be deposited should be positive");
        } else {
            balance = balance + amount;
            transactions[numOfTransactions] = amount;
            numOfTransactions++;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount to be withdrawn should be positive");
        } else {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                transactions[numOfTransactions] = amount;
                numOfTransactions++;
            }
        }
    }
}