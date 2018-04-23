package bankaccount;

public class AccountProcess {

        
		private Account account = null;
		double salary;
		
		public AccountProcess(double salary, Account acc) {
			this.salary=salary;
			account = acc;
			System.out.println("account no:"+account+"opening balance"+salary);
		}
	public void takeMoney(double amount) {
		
			account.doCredit(amount);
		}

		public void giveMoney(double amount) {
			
			account.doDebit(amount);
		}
	public void getTransactionString() {
			account.getMiniStatement();
		}

		public double checkAccountBalance() {
			return account.checkBalance();
		}
	

}
