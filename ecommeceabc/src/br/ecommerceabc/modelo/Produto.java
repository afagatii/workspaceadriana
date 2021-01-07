package br.ecommerceabc.modelo;
/*
 * Design Pattern (Padroes para projetos)
 * DTO (Um pattern - Data Transfer Object)
 * Diz que:
 * TODOS os atributos devem ser privados
 * CADA atributo deve possuir um metodo INDIVIDUAL de input e outro de output
 */
public class Produto {
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	
	
	
	
}
