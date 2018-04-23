package bankaccount;


	public class Transaction {

		private String description;
		private double amount;
		
		public Transaction(String purpose, double amount) {
			description = new String(purpose);
			this.amount = amount;
		}
		
		public String getPurpose() {
			return description;
		}
		
		public double getAmount() {
			return amount;
		}
		
	}
	

