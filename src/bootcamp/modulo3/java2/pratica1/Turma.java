package bootcamp.modulo3.java2.pratica1;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String serie;
	private String codigo;
	private List<Disciplina> disciplinas = new ArrayList();
	private List<Estudante> estudantes = new ArrayList();

	public Turma() {
	}

	public Turma(String serie, String codigo) {
		this.serie = serie;
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void addEstudante(Estudante estudante) {
		estudantes.add(estudante);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("A Turma " + codigo + " - "+ serie + " Série");
		builder.append(" contém " + disciplinas.size() + " Diciplinas ");
		builder.append(", sendo elas " + disciplinas + ".\n");
		builder.append("A Turma contém "+ estudantes.size()+ " estudantes, sendo eles ");
		builder.append(estudantes);
		return builder.toString();
	}

}