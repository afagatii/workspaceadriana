package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		char operador = JOptionPane.showInputDialog("Digite <+>, <->, <*> ou </>").charAt(0);
		int resultado=0;
		if (operador=='+') {
			resultado=valor1+valor2;
		}else if (operador=='-') {
			resultado=valor1-valor2;
		}else if (operador=='*') {
			resultado=valor1*valor2;
		}else if (operador=='/') {
			if (valor2!=0) {
				resultado=valor1/valor2;
			}
		}else {
			System.out.println("Operador invalido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
