package bootcamp.modulo3.java2.pratica2;

import java.util.Scanner;

import bootcamp.modulo3.java2.pratica2.exceptions.InvalidPasswordException;

public class PasswordMedia extends Password {

	private static String REGEX_MEDIO = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$"; //Gabriel1

	public PasswordMedia(String regex) {
		super(regex);
	}

	public static void main(String[] args) {
		try {
			PasswordMedia senhaMedia = new PasswordMedia(REGEX_MEDIO);
			Scanner input = new Scanner(System.in);

			System.out.print("Defina sua senha: ");
			String senha = input.next();

			input.close();

			senhaMedia.setValue(senha);
			System.out.println("Senha definida com sucesso!");

		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}