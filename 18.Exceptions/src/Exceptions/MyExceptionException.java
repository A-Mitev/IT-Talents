package Exceptions;

public class MyExceptionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8721291362365675412L;
	
	public MyExceptionException(String message){
		super(message);
	}
	
	public MyExceptionException(Throwable cause){
		super(cause);
	}
	
	public MyExceptionException(String message, Throwable cause){
		super(message, cause);
	}
}
