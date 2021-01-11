package br.com.bancofoz.implementacao;

import javax.swing.JOptionPane;

public class ImplementarConta {

	public static void main(String[] args) {
		
		Conta conta = null;
		char resp=JOptionPane.showInputDialog("Digite <1> para Corrente").charAt(0);
		if (resp='1') {
			conta=new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("agencia"),
					0,
					new Cliente(
							Magica.i("Codigo Cliente"),
							Magica.s("Nome Cliente"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Limite"),
					Magica.f("taxa")
								
					);
		} else {
			conta=new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("agencia"),
					0,
					new Cliente(
							Magica.i("Codigo Cliente"),
							Magica.s("Nome Cliente"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Rendimento")
			
					);
				
		}
		System.out.println(conta.depositar());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
