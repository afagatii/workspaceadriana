package br.com.bancofoz.beans;

public class Corrente extends Conta {
	
	private float limite;
	private float taxa;
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public Corrente(float limite, float taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}
	public Corrente.setAll(float limite, float taxa) {
		super.setAll();
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
