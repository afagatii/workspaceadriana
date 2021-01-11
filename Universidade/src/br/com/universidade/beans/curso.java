package br.com.universidade.beans;

public class curso {
	private String descricao;
	private int cargaHoraria;
	private float valor;
	private Unidade unidade;
	
	public float getMensalidade() {
		return valor/ (cargaHoraria/100);
	}
	
	
	public void setAll(String descricao, int cargahoraria, float valor, Unidade unidade) {
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
		this.unidade = unidade;
	}
	@Override
	public String toString() {
		return "curso [descricao=" + descricao + ", cargahoraria=" + cargaHoraria + ", valor=" + valor + ", unidade="
				+ unidade + "]";
	}
	public curso() {
		super();
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	
	
	
	
	
	

}
