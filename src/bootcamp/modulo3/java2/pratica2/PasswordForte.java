package bootcamp.modulo3.java2.pratica2;

import java.util.Scanner;

import bootcamp.modulo3.java2.pratica2.exceptions.InvalidPasswordException;

public class PasswordForte extends Password {

	private static String REGEX_FORTE = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"; //Gabriel@1

	public PasswordForte(String regex) {
		super(regex);
	}

	public static void main(String[] args) {
		try {
			PasswordForte senhaForte = new PasswordForte(REGEX_FORTE);
			Scanner input = new Scanner(System.in);

			System.out.print("Defina sua senha: ");
			String senha = input.next();

			input.close();

			senhaForte.setValue(senha);
			System.out.println("Senha definida com sucesso!");

		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}