package br.com.concessionariaxyz.modelo;

public class Veiculo {
	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private float valor;
	//sintaxe dos metodos
	//<modificador> <tipo do retorno> <nome do metodo>
	public String verificarStatus() {
		return "Ligado?" + status+ "\n" + "Velocidade Atual:" + velocidadeAtual;
	}
	
	public void acelerar(float param) {
		if ((velocidadeAtual+param)<=velocidadeMaxima && status==true) {
			velocidadeAtual+=param;
		}
	}
	public void acelerar() {
		if ((velocidadeAtual+10)<=velocidadeMaxima && status==true) {
		velocidadeAtual+=10;
		}
	}
	
	public void desacelerar() {
		if (velocidadeAtual>0 & status==true) {
			velocidadeAtual-=10;
		}
	}
	
	public String desligar() {
		if (status==true) {
			status=false;
			velocidadeAtual=0;
		}
		return "Veiculo Desligado";
	}
	public String ligar() {
		if (status==false) {
			status=true;
		}
		return "Ve�culo Ligado";
	}
	
	public String retornarMontadora() {
		return montadora;
	}
	public void preencherMontadora(String param) {
		montadora=param.toUpperCase();
	}
	public void preencherModelo(String param) {
		modelo=param.toUpperCase();
	}
	public String retornarModelo() {
		return modelo;
	}
	public void preencherVelocidadeMaxima(float param) {
		if (param>0) {
		velocidadeMaxima=param;
		}
	}
	public float retornarVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void preencherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}
	public float retornarValor() {
		return valor;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
