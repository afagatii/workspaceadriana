package br.com.banco.beans;

public class conta {

	private int numero;
	private float saldo;
	privent Cliente cliente;
	private Agencia agencia;
	private Gerente gerente;
	
	public void depositar (float valor) {
	if  (valor>0) {
		saldo+=valor;
	}
	
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public privent getCliente() {
		return Cliente;
	}
	public void setCliente(privent cliente) {
		Cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public conta(int numero, float saldo, privent cliente, Agencia agencia, Gerente gerente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		Cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}
	@Override
	public String toString() {
		return "conta [numero=" + numero + ", saldo=" + saldo + ", agencia=" + agencia + "]";
	}
	public conta() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
