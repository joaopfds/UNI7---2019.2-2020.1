package aula17092019inputoutput;

import javax.swing.JOptionPane;


public class AtracaoTuristica {
	String nome;
	String descricao;
	
	public AtracaoTuristica(String nome) {
		this.nome = nome;
	}
	public void exibir() {
		//System.out.println();
		//System.out.println("\n");
		
		JOptionPane.showMessageDialog(null, "- "+ this.nome);
		System.exit(0);
	}

}
