package bootcamp.modulo3.java3.pratica1;

public class Pessoa implements Precedente<Pessoa> {

	private String nome;
	private String cpf;

	public Pessoa() {
	}

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public int precedeA(Pessoa p) {
		return getNome().compareTo(p.getNome());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa - ");
		builder.append("Nome: " + nome);
		builder.append(", CPF: " + cpf);
		return builder.toString();
	}
}