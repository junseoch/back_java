package exceptionTask;

public class WrongWordException extends RuntimeException{
	public WrongWordException() {;}
	public WrongWordException(String message) {
		super(message);
	}
	
}
