package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada2 {

	public static void main(String[] args) {
		String hospede=JOptionPane.showInputDialog("Nome do Hospede:");
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Qtde di�rias:"));

		if (diaria>15) {
			float conta=diaria*(float)5.50;
			System.out.println("O saldo para pagamento e:" +conta );
		}else if (diaria==15) {
			float conta=diaria*(float)6.00;
			System.out.println("O saldo para pagamento �:" +conta );
		}else {
			float conta=diaria*(float)8.00;
			System.out.println("O saldo para pagamento �:" +conta);
		}
		System.out.println("Nome do Hospede:" +hospede);
		System.out.println("Saldo para pagamento �" +conta);
	}

















}

}
