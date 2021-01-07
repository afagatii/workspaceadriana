package repeticao;

import javax.swing.JOptionPane;

public class ListaExercicio1 {

	public static void main(String[] args) {
	
			int dia=Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia"));
			while (dia>31) {
				dia=Integer.parseInt(JOptionPane.showInputDialog("Digite a data novamente"));
			} 	
			int mes=Integer.parseInt(JOptionPane.showInputDialog("Entre com o mes"));
			while (mes>12) {
				mes=Integer.parseInt(JOptionPane.showInputDialog("Digite o mês novamente"));
			}
			String ano = JOptionPane.showInputDialog("Digite o ano:");
			while (ano.length()>4) {
				ano=JOptionPane.showInputDialog("Digite o ano novamente:"); 
			}
			System.out.println("dia" +dia);
			System.out.println("mes" +mes);
			System.out.println("ano" +ano);	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
