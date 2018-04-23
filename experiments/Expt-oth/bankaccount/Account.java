package bankaccount;


	public class Account {

		private String account;
		private double balance;
		Transaction[] transactions;
		private int slno;
		
		public Account(String account,double balance) {
			// TODO Auto-generated constructor stub
			this.balance = balance;
			this.account = account;
			transactions = new Transaction[10];
			slno = 0;
		}
		
		public void doDebit(double amount) {
			
			balance -= amount;

	transactions[slno] =  new Transaction("debited from account",amount);
		 slno++;
		}
		
		public void doCredit(double amount) {
			balance += amount;
			
	transactions[slno] =  new Transaction("credited to account",amount);
			slno++;
		}

		public double checkBalance() {
			return balance;
		}
		public void  getMiniStatement() {

			for(int i=0;i<slno;i++) {
				System.out.println(transactions[i].getPurpose()+" amount: "+ transactions[i].getAmount());
			}
		}
		
		public String showAccount() {
			return account;
		}
	}




