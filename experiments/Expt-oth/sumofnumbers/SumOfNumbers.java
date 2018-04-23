package sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner consoleInput = new Scanner(System.in);
		int array[] = new int[10];
		int check;
		int sum=0;

		System.out.println("Enter numbers: ");
		for (int i = 0; i < array.length; i++) {

			check = consoleInput.nextInt();

			try {
				if ( !(check > 10 && check < 40)) {

					throw new NumberOutOfRangeException("Number must be between 10 & 40");
				}

				array[i] = check;
				sum=sum+check;

			} catch (NumberOutOfRangeException e) {

				System.out.println("You have entered a value which is out of range;");

				

				do {
					System.out.print("Enter again: ");
					check = consoleInput.nextInt();
					
				} while (!(check < 40 && check > 10));

				array[i] = check;
				sum=sum+check;
			}

		}
        System.out.println("sum of valid numbers is"+sum);
		consoleInput.close();
	}

}