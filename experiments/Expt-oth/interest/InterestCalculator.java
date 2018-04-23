package interest;

//import java.util.Scanner;

public class InterestCalculator {
	/*Scanner sc=new Scanner(System.in);
	 static double principal, interestrate, time;
	    public InterestCalculator(){
	    	 
		        System.out.println("Enter the Principal amount : ");
		         this.principal=sc.nextDouble();
		         System.out.println("Enter the Interestrate amount : ");
		        this.interestrate=sc.nextDouble();
		         System.out.println("Enter the time : ");
		        this.time=sc.nextDouble();
	    }*/
	    public static double calculateSimpleInterest(double principal,double interestrate,double time){
	        double interest=(principal*interestrate*time)/100;
	        return interest;
	    }
	    public static double calculateCompoundInterest(double principal,double interestrate,double time){
	        double interest=Math.pow(1+(interestrate/100),time)*principal-principal;
	        return interest;
	    }
	    
	}


