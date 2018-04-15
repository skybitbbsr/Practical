public class BankingCalculate {
    private BankingPerson[] accounts;
    private int numOfAccounts;

    public BankingCalculate() {
        accounts = new BankingPerson[100];
        numOfAccounts = 0;
    }

    public int openNewAccount(String customerName, double openingBalance) {
        BankingPerson b = new BankingPerson(customerName, openingBalance);
        accounts [numOfAccounts] = b;
        numOfAccounts++;
        return b.getAccountNum();
    }

    public void withdrawFrom(int accountNum, double amount) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                accounts[i].withdraw(amount);
                System.out.println("Amount withdrawn successfully");
                return;
            }
        }
        System.out.println("Account number not found.");
    }

    public void depositTo(int accountNum, double amount) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                accounts[i].deposit(amount);
                System.out.println("Amount deposited successfully");
                return;
            }
        }
        System.out.println("Account number not found.");
    }

    public void printAccountInfo(int accountNum) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                System.out.println(accounts[i].getAccountInfo());
                return;
            }
        }
        System.out.println("Account number not found.");
    }

    static class Bank {
        private BankingPerson[] accounts;
        private int numOfAccounts;
        public Bank() {
            accounts = new BankingPerson[100];
            numOfAccounts = 0;
        }

        public int openNewAccount(String customerName, double openingBalance) {
            BankingPerson b = new BankingPerson(customerName, openingBalance);
            accounts[numOfAccounts] = b;
            numOfAccounts++;
            return b.getAccountNum();
        }

        public void withdrawFrom(int accountNum, double amount) {
            for (int i = 0; i < numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()) {
                    accounts[i].withdraw(amount);
                    System.out.println("Amount withdrawn successfully");
                    return;
                }
            }
            System.out.println("Account number not found.");
        }

        public void depositTo(int accountNum, double amount) {
            for (int i = 0; i < numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()) {
                    accounts[i].deposit(amount);
                    System.out.println("Amount deposited successfully");
                    return;
                }
            }
            System.out.println("Account number not found.");
        }

        public void printAccountInfo(int accountNum) {
            for (int i = 0; i < numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
            System.out.println("Account number not found.");
        }

    }
}
