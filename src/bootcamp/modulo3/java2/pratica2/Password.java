package bootcamp.modulo3.java2.pratica2;

import bootcamp.modulo3.java2.pratica2.exceptions.InvalidPasswordException;

public abstract class Password {

	private String regex;

	public Password(String regex) {
		this.regex = regex;
	}

	public void setValue(String pwd) throws InvalidPasswordException {
		
		if (!pwd.matches(regex))
			throw new InvalidPasswordException("Sua senha nao atende ao minimo requerido!!");
	}
}