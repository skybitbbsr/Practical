package largesmall;

public class Check {
	

		public static void main(String[] args) {
			int myArray[] = new int[] { 34, 67, 4, 2, 34, 5 };

			LargeSmall myNumberSet = new LargeSmall(myArray);

			System.out.println("The Largest number is: "
					+ myNumberSet.findLargest());
			System.out.println("The Smallest number is: "
					+ myNumberSet.findSmallest());
		}
	}


