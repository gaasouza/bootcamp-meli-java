package bootcamp.modulo3.java2.pratica1;

public class Disciplina {

	private String nome;
	private double cargaHoraria;

	public Disciplina() {
	}

	public Disciplina(String nome, double cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(", cargaHoraria de ");
		builder.append(cargaHoraria);
		builder.append(" horas");
		return builder.toString();
	}

}