	package bankaccount;
    import java.util.Scanner;
	public class Banking {
		public static void main(String[] args) {
			AccountProcess myEmp = new AccountProcess(4500,
					new Account("33304458112", 1000));
			int j=0;
		    Scanner sc=new Scanner(System.in);
			while(j<4){
				System.out.println("press 1 for deposit \n press 2 for withdraw");
				System.out.println("enter your choice");
				int i=sc.nextInt();
				switch(i){
				
				case 1:
					double amount=sc.nextDouble();
			        myEmp.takeMoney(amount);
			        break;
				case 2:
					double amoun=sc.nextDouble();
					myEmp.giveMoney(amoun);
					break;
						}
			System.out.println("total transactions");
			myEmp.getTransactionString();
			System.out.println("Remaining Blanace: " + 
	        myEmp.checkAccountBalance());
			j++;
			}
		}

		
	}



