package bootcamp.modulo3.java2.pratica1;

import java.time.LocalDate;

public class Estudante {

	private String matricula;
	private String nome;
	private LocalDate dataNascimento;
	private String serie;

	public Estudante() {
	}

	public Estudante(String nome, LocalDate dataNascimento, String matricula, String serie) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(matricula);
		builder.append(" - ");
		builder.append(nome);
		return builder.toString();
	}

}