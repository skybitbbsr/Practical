package sumofnumbers;

public class NumbersWithException {

	NumberSet array = null;

	public NumbersWithException(int[] array) {

		this.array = new NumberSet(array);

	}

	public void check() throws NumberOutOfRangeException {

		for (int i = 0; i < array.length; i++) {

			if (array.getValue(i) < 10 || array.getValue(i) > 40) {

				throw new NumberOutOfRangeException("Number must be between 10 & 40");
			}

		}

	}
}
