package largesmall;

public class LargeSmall {


	
		protected int array[];

		public LargeSmall(int array[]) {
			this.array = new int[array.length];
			System.arraycopy(array, 0, this.array, 0, array.length);
		}

		public void displayArray() {
			for (int t : array) {
				System.out.print(t + " ");
			}
		}

		public int findLargest() {
			int largest = 0;
			for (int number : array) {
				if (largest < number) {
					largest = number;
				}
			}
			return largest;
		}

		public int findSmallest() {
			int smallest = findLargest();
			for (int number : array) {
				if (smallest > number) {
					smallest = number;
				}
			}
			return smallest;
	}
	}

	


