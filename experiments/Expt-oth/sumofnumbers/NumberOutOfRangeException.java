package sumofnumbers;

public class NumberOutOfRangeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public NumberOutOfRangeException(String reason) {
		super(reason);
	}

}