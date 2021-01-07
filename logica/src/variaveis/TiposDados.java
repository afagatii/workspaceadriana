package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		
		String nome=JOptionPane.showInputDialog("Digite o seu nome");
		int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
		double peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
		double imc=peso/(altura*altura);
		System.out.println("nome..: " + nome);
		System.out.println("idade.: " + idade);
		System.out.println("altura:" + altura);
		System.out.println("imc" + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
