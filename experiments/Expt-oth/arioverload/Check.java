package arioverload;

public class Check {
	

		public static void main(String[] args) {
			
			int intArray[] = new int[] { 10,34,200,500,87,23,92,5};
			double doubArray[] = new double[] {10.2,54.377,63.0,88.9,243,1.56,9.3,123.000};
			int a=15,b=20;
			double c=20,d=15;
			System.out.printf("The summation of doubleArray is: %.2f \n",Arithmatic_Overload.addNum(doubArray));
			System.out.println("The summation of intArray is: "+ Arithmatic_Overload.addNum(intArray));
			System.out.println("The multiplication of doubleArray is: "+ Arithmatic_Overload.mulNum(doubArray));
			System.out.println("The multiplication of intArray is: "+ Arithmatic_Overload.mulNum(intArray));
			System.out.println("The substraction of two integer is: "+ Arithmatic_Overload.subNum(a,b));
			System.out.println("The substraction of two double  is: "+ Arithmatic_Overload.subNum(c,d));
		}
	}

