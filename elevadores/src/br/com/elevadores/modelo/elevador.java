package br.com.elevadores.modelo;

public class elevador {
private short capacidadeMaxima;
private short andarMaximo;
private short andarMinimo;
private short qtdePessoas;
private short andarAtual;

public void sair() {
	if (qtdePessoas)
}

public void sair(short qtde) {
	short resultado = (short) (qtdePessoas-qtde);
	if (resultado>=0) {
			qtdePessoas-=qtde;
	}
}
public void entrar(short qtde) {
	short resultado=(short) (qtde + qtdePessoas);
	if (resultado<=capacidadeMaxima) {
		qtdePessoas+=qtde;
	}
}
public void descer() {
	if (andarAtual>andarMinimo) {
		andarAtual--;
	}
}

public void subri() {
	if (andarAtual<andarMaximo) {
		andarAtual++;
	}
}

public String verificarStatus() {
return
		"Qtde Pessoas.....:" + qtdePessoas + "\n" +
		"Andar Atual......:" + andarAtual + "\n" +
		"Capacidade Maxima:" + capacidadeMaxima;
}
public void inicializar(short capacidade, short maior, short menor); {
	capacidadeMaxima = capacidade;
	andarMaximo=maior;
	andarMinimo=menor;
	

	}

}
