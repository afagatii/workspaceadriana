package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		
	String produto=JOptionPane.showInputDialog("Digite o seu produto");
	String categoria=JOptionPane.showInputDialog("Digite a categoria");
	double valor=Double.parseDouble(JOptionPane.showInputDialog("Valor"));
	int qtde=Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
	double imposto=Double.parseDouble(JOptionPane.showInputDialog("Imposto"));
	double total=valor*qtde;
	double totimp=total * 10%;
	
	
	System.out.println("produto......" + produto);
	System.out.println("categoria...." + categoria);
	System.out.println("valor........" + valor);
	System.out.println("quantidade..." + qtde);
	System.out.println("imposto......" + imposto);
	System.out.println("total sem imposto......" + total);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
