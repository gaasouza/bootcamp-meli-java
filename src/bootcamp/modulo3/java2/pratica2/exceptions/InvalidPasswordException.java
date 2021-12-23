package bootcamp.modulo3.java2.pratica2.exceptions;

public class InvalidPasswordException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidPasswordException(String msg) {
		super(msg);
	}
}