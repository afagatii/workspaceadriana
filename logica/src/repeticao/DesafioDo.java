package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	
	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
		int chute = 0;
	    int contador=0;
		do {
				chute = Integer.parseInt(JOptionPane.showInputDialog("Tente Advinhar"));
			contador=contador+1;
			if (chute>valor) {
				JOptionPane.showMessageDialog(null, "Voc� est� chutando alto");
			} else if (chute<valor) {
				JOptionPane.showMessageDialog(null,  "Voc� est� chutando baixo");
			}
		}while(chute!=valor);
		JOptionPane.showMessageDialog(null,"Parab�ns vc acertou com:" + contador + " tentativa(s).");
	}

}
