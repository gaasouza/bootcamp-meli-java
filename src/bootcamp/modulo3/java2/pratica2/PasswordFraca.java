package bootcamp.modulo3.java2.pratica2;

import java.util.Scanner;

import bootcamp.modulo3.java2.pratica2.exceptions.InvalidPasswordException;

public class PasswordFraca extends Password {

	private static String REGEX_FRACA = "^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,}$"; //gabriel1

	public PasswordFraca(String regex) {
		super(regex);
	}

	public static void main(String[] args) {
		try {
			PasswordFraca senhaFraca = new PasswordFraca(REGEX_FRACA);
			Scanner input = new Scanner(System.in);

			System.out.print("Defina sua senha: ");
			String senha = input.next();

			input.close();

			senhaFraca.setValue(senha);
			System.out.println("Senha definida com sucesso!");

		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}