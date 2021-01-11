package br.com.banco.implementacao;

import br.com.banco.beans.Cliente;
import br.com.banco.util.Magica;
import br.com.banco.beans.Agencia;
import br.com.banco.beans.Conta;


public class ImplementarConta {
	
	
	
	
	public static void main(String[] args) {
		Conta conta = new Conta(
				Magica.i("Digite o numero da conta"),
				Magica.f("Digite o saldo")
				new Cliente(
						Magica.i("Código do Cliente"),
						Magica.s("Nome do Cliente"),
						Magica.s("Email"),
						new Endereco(
							Magica.s("Logradouro Cliente"),
							Magica.s("Bairro Cliente"),
							Magica.s("Cidade Cliente"),
							Magica.s("UF Cliente"),
							Magica.s("CEP Cliente"),
							Magica.s("Numero Cliente"),
							Magica.s("Complemento Cliente")
						)
				),
		new Agencia(
				Magica.s("Nome da Agencia"),
				Magica.i("Numero Agencia"),
				New Endereco(
						Magica.s("Logradouro Agencia"),
						Magica.s("Bairro Agencia"),
						Magica.s("Cidade Agencia"),
						Magica.s("UF Agencia"),
						Magica.s("CEP Agencia"),
						Magica.s("Numero Agencia"),
						Magica.s("Complemento Agencia")
						),
				Magica.s("Telefone"),
				Magica.i("Codigo da Agencia")
				
				),
			new Gerente(
					Magica.s("Nome do Gerente"),
					Magica.s("Telefone"),
					Magica.s("Email")
					)
			
		System.out.println();
	}

}
