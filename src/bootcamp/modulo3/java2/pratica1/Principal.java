package bootcamp.modulo3.java2.pratica1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		// criando Estudantes
		List<Estudante> estudantes = fabricaDeEstudantes();

		// criando Diciplinas
		List<Disciplina> disciplinas = fabricaDeDisciplinas();

		// criando e populando turmas
		Turma turma1 = new Turma();
		turma1.setCodigo("T01");
		turma1.setSerie("1o");
		disciplinas.forEach(d -> turma1.addDisciplina(d));
		populaTurmaComEstudantes(estudantes, turma1);

		Turma turma2 = new Turma();
		turma2.setCodigo("T02");
		turma2.setSerie("2o");
		disciplinas.forEach(d -> turma2.addDisciplina(d));
		populaTurmaComEstudantes(estudantes, turma2);

		Turma turma3 = new Turma();
		turma3.setCodigo("T03");
		turma3.setSerie("3o");
		disciplinas.forEach(d -> turma3.addDisciplina(d));
		populaTurmaComEstudantes(estudantes, turma3);

		System.out.println(turma1);
		System.out.println(turma2);
		System.out.println(turma3);
		
	}

	private static void populaTurmaComEstudantes(List<Estudante> estudantes, Turma turma) {
		estudantes.stream().filter(e -> e.getSerie().equals(turma.getSerie())).forEach(e -> turma.addEstudante(e));
	}

	private static List<Disciplina> fabricaDeDisciplinas() {
		Disciplina d1 = new Disciplina("Java", 200.0);
		Disciplina d2 = new Disciplina("Estrutura de Dados", 150.0);

		List<Disciplina> disciplinas = new ArrayList<>();
		Collections.addAll(disciplinas, d1, d2);

		return disciplinas;
	}

	private static List<Estudante> fabricaDeEstudantes() {
		Estudante e1 = new Estudante("Gabriel Souza", LocalDate.of(2000, 6, 27), "0001A1", "3o");
		Estudante e2 = new Estudante("Carlos Santos", LocalDate.of(1977, 11, 1), "0001A2", "2o");
		Estudante e3 = new Estudante("Gustavo Silva", LocalDate.of(1999, 9, 5), "0001A3", "1o");
		Estudante e4 = new Estudante("Vinicius Bastos", LocalDate.of(1999, 9, 5), "0001A4", "3o");
		Estudante e5 = new Estudante("Joao Pedro", LocalDate.of(1999, 9, 5), "0001A5", "2o");
		Estudante e6 = new Estudante("Rodrigo Silva", LocalDate.of(1999, 9, 5), "0001A6", "1o");

		List<Estudante> estudantes = new ArrayList<>();
		Collections.addAll(estudantes, e1, e2, e3, e4, e5, e6);

		return estudantes;
	}
}