package br.com.universidade.beans;

public class aluno {
	private int rm;
	private String nome;
	private String fone;
	private Boolean status;
	
	public String getSaudacao() {
		if (nome.contains("")==true)
			return nome.substring(0,nome.indexOf(""));
	}
		return nome;

	
	public void setAll(int rm, String nome, String fone, Boolean status) {
		this.rm = rm;
		this.nome = nome;
		this.fone = fone;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "aluno []";
	}
	public aluno(int rm, String nome, String fone, Boolean status) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.fone = fone;
		this.status = status;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setAtivo(Boolean status) {
		this.status = status;
	}
	
	
	
	
	
	
}
