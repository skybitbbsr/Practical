package interest;
import java.util.Scanner;
public class Interest {

	    public static void main(String[] args) {
	    	double principal, interestrate, time;
	    	Scanner sc=new Scanner(System.in);
	   	    
	   	    	 
	   		        System.out.println("Enter the Principal amount : ");
	   		         principal=sc.nextDouble();
	   		         System.out.println("Enter the Interestrate amount : ");
	   		        interestrate=sc.nextDouble();
	   		         System.out.println("Enter the time : ");
	   		        time=sc.nextDouble();
	    
	    	
	        System.out.println("The Simpleinterest is "+ InterestCalculator.calculateSimpleInterest(principal, interestrate, time));
	        System.out.println("The compound interest is : "+InterestCalculator.calculateCompoundInterest(principal, interestrate, time) );
	       
	    }
	    
	}


