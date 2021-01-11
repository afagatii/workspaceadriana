package br.com.universidade.beans;

public class Turma {
	private String sigla;
	private String periodo;
	private String sala;
	private String Aluno;
	private Professor professor;
	private curso curso;
	
	
	
	public void setAll(String sigla, String periodo, String sala, String aluno, Professor professor,
			br.com.universidade.beans.curso curso) {
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
		Aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}



	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", sala=" + sala + ", Aluno=" + Aluno + ", professor="
				+ professor + ", curso=" + curso + "]";
	}



	public Turma() {
		super();
	}



	public Turma(String sigla, String periodo, String sala, String aluno, Professor professor,
			br.com.universidade.beans.curso curso) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
		Aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}



	public String getSigla() {
		return sigla;
	}



	public void setSigla(String sigla) {
		this.sigla = sigla;
	}



	public String getPeriodo() {
		return periodo;
	}



	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}



	public String getSala() {
		return sala;
	}



	public void setSala(String sala) {
		this.sala = sala;
	}



	public String getAluno() {
		return Aluno;
	}



	public void setAluno(String aluno) {
		Aluno = aluno;
	}



	public Professor getProfessor() {
		return professor;
	}



	public void setProfessor(Professor professor) {
		this.professor = professor;
	}



	public curso getCurso() {
		return curso;
	}



	public void setCurso(curso curso) {
		this.curso = curso;
	}



	public String getResumo() {
		return
				"Nome do Curso:" + Curso.getDescricao() + "\n" +
				"sala" + sala = "\n" +
				"Aluno:" + aluno.getSaudacao() + "\n" +
						"Nome Unidade:" + curso.getUnidade() + getNome() + "\n" +
				"Professor:" +professor.getSaudacao();
	}
	

}
