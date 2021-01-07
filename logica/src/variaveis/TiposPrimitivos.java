package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		/*
		 * boolean => dado lógico (true/false)
		 */
		float semestral1=Float.parseFloat(JOptionPane.showInputDialog("Semestral 1"));
		float semestral2=Float.parseFloat(JOptionPane.showInputDialog("Semestral 2"));
		short faltas=Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		String disciplina=JOptionPane.showInputDialog("Disciplina");
		float media = (semestral1 + semestral2) /2;
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Faltas: " + faltas);
		System.out.println("Média: " + media);
		float semestral3 = (float) 7.45;
		int teste = (int) semestral3;
		short pequena = (short) teste;
		long maior = pequena;
		
		
		
		
		
		
		
		
			

	}

}
