package bankTask;

public class ClientNameException extends Exception {

	
	private static final long serialVersionUID = -4006051281535626729L;

	public ClientNameException() {
	}

	public ClientNameException(String message) {
		super(message);
		
	}

	public ClientNameException(Throwable cause) {
		super(cause);
		
	}

	public ClientNameException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ClientNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
