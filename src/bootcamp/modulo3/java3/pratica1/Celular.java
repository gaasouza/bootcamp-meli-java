package bootcamp.modulo3.java3.pratica1;

public class Celular implements Precedente<Celular> {

	private String proprietario;
	private String numero;

	public Celular() {
	}

	public Celular(String proprietario, String numero) {
		this.proprietario = proprietario;
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Celular - ");
		builder.append("Número: " + numero);
		builder.append(", Proprietário: " + proprietario);
		return builder.toString();
	}

	@Override
	public int precedeA(Celular c) {
		return getProprietario().compareTo(c.getProprietario());
	}

}