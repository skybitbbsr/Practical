package sumofnumbers;

public class NumberSet {

	private int[] number = null;
	private int index;
	public int length;

	public NumberSet(int[] array) {
		number = new int[array.length];
		System.arraycopy(number, 0, array, 0, array.length);
		index = 0;
		length = number.length;
	}

	public int[] getNumbers() {
		return number;
	}

	public int insert(int number) {
		this.number[index] = number;
		index++;
		return index;
	}

	public int getValue(int index) {
		if (index > number.length || index < 0)
			return -1;
		else
			return number[index];
	}

}