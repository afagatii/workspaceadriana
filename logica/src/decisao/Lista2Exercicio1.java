package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		byte diarias = Byte.parseByte(JOptionPane.showInputDialog("Qtde diarias"));
		float taxa = (float) 5.5;
		If (diarias == 15) {
			taxa=6;
		} else 
			if (diarias<15){
			taxa=8;
		}
		System.out.println("Total da reserva:" +((80+taxa)*diarias));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
