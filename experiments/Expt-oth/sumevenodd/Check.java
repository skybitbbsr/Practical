package sumevenodd;
import java.util.Scanner;
public class Check {
	
        
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of element to be entered into the array");
			int length=sc.nextInt();
			int i;
			
			int myArray[] = new int[length];
			System.out.println("enter value to the Array");
			for( i=0;i<length;i++){
				myArray[i]=sc.nextInt();
				
			}
			
			Sum_Even_Odd NumberSet=new Sum_Even_Odd(myArray);
			
		System.out.println("Even sum of the array is: "+NumberSet.getEvenSum());
		System.out.println("Odd sum of the array is: "+NumberSet.getOddSum());
			NumberSet.displayArray();
		}
	}


