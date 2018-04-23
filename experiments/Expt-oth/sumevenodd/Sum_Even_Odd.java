package sumevenodd;

public class Sum_Even_Odd {
	

 

		protected int array[];

		public Sum_Even_Odd(int array[]) {

			this.array = new int[array.length];
			System.arraycopy(array, 0, this.array, 0, array.length);
		}

		public int getEvenSum() {
			int sum = 0;
			for (int n : array) {
				if(n%2 == 0) {
					sum+=n;
				}
			}
		return sum;
		}
		
		public int getOddSum() {
			int sum = 0;
			for (int n : array) {
				if(!(n%2 == 0)) {
					sum+=n;
				}
			}
			return sum;
		}

		public void displayArray() {
			for (int val : array) {
				System.out.print(val+" ");
			}
			
		}
		
		
	}

	




