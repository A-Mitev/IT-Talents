package bankTask;

public class InvalidDepositNameException extends Exception {

	
	private static final long serialVersionUID = -5900604602795547864L;

	public InvalidDepositNameException() {
	}

	public InvalidDepositNameException(String message) {
		super(message);
	}

	public InvalidDepositNameException(Throwable cause) {
		super(cause);
	}

	public InvalidDepositNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDepositNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
