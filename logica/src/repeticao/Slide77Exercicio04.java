package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio04 {

	public static void main(String[] args) {
		String nome="";
		short idade=0;
		short qtdeMaioresIdade=0;
		short qtdePessoas=0;
		short totalIdades=0;
		short idadeMaisExperiente=0;
		String nomeMaisExperiente="";
		short idadeMaisJovem=0;
		String nomeMaisJovem="";
		do {
			nome=JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			idade=Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
			if (idade>=18) {
				qtdeMaioresIdade = (short) (qtdeMaioresIdade + 1);
				
			}
			qtdePessoas++;
			totalIdades+=idade;
			if (idade>idadeMaisExperiente) {
				idadeMaisExperiente=idade;
				nomeMaisExperiente=nome;
			}
			if (idade<idadeMaisJovem || qtdePessoas==1) {
				idadeMaisJovem=idade;
				nomeMaisJovem=nome;
			}
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta",JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Maiores de Idade:" +qtdeMaioresIdade);
		System.out.println("Média das Idades:" +(totalIdades/qtdePessoas));
		System.out.println("A pessoa mais experiente é a:" + nomeMaisExperiente + "com" +idadeMaisExperiente + "anos");
		System.out.println("A pessoas mais jovem é a :" +nomeMaisJovem);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
