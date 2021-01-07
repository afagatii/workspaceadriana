package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String Nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade1 = Short.parseShort(JOptionPane.showInputDialog("Idade1"));
		System.out.println("Nome:" + Nome);
		if (idade1>70 ) {
			System.out.println(nome+ "VotoFacultativo");
		}
		if (idade1>=16 && idade1<18) {
			System.out.println(nome+ "Voto Facultativo");
		}
		if (idade1 < 16) {
			System.out.println(nome+ "Vc não pode votar");
		}
		if (idade>=18 && idade<70) {
			System.out.println(nome+ "Vc é obrigado a votar");
		}
			
		//System.out.println("Nome:" + Nome);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
