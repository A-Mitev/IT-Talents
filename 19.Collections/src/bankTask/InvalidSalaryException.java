package bankTask;

public class InvalidSalaryException extends Exception {

	
	private static final long serialVersionUID = -7593187515350653400L;

	public InvalidSalaryException() {
	}

	public InvalidSalaryException(String arg0) {
		super(arg0);
	}

	public InvalidSalaryException(Throwable arg0) {
		super(arg0);
	}

	public InvalidSalaryException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidSalaryException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
