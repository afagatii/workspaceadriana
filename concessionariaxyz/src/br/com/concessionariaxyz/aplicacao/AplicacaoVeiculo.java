package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("fiaT");
		System.out.println("Montadora..............." +objeto.retornarMontadora());
		objeto.preencherModelo("Uno");
		System.out.println("Modelo.................." +objeto.retornarModelo());
		objeto.preencherValor(30000);
		System.out.println("Valor..................." +objeto.retornarValor());
		objeto.preencherVelocidadeMaxima(180);
		System.out.println("Velocidade Maxima......." +objeto.retornarVelocidadeMaxima());
	
		System.out.println(objeto.ligar());
		
		objeto.acelerar(20);
		objeto.acelerar();
		objeto.acelerar(50);
		System.out.println(objeto.verificarStatus());
		objeto.desacelerar();
		objeto.desacelerar();
		objeto.desacelerar();
		objeto.desacelerar();
		objeto.desacelerar();
		objeto.desacelerar();
		
		System.out.println(objeto.desligar());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
