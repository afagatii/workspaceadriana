package br.com.bancofoz.beans;

public class Poupanca extends Conta {
	
	private float rendimentos;
	
	
	@Override
	public String toString() {
		return "Poupanca [rendimentos=" + rendimentos + "]";
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super(numero, digito, agencia, saldo, cliente);
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimentos) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimentos = rendimentos;
	}

	public float getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(float rendimentos) {
		this.rendimentos = rendimentos;
	}

	public Poupanca void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimentos) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimentos = rendimentos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

}
