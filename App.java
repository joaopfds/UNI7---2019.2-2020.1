package aula17092019inputoutput;

import javax.swing.JOptionPane;


public class App {
	public static void main(String[]args) {
		String nomeParque = JOptionPane.showInputDialog("Qual é o nome do parque jollw?");
		String estado = JOptionPane.showInputDialog("Em qula estado está localizado o parque ?");
		String anoDeCriacao = JOptionPane.showInputDialog("Qual o ano no qual o parque foi criado ?");
		
		JOptionPane.showMessageDialog(null, anoDeCriacao);
		
		//Parque veadeiros = new ParqueNacional("Parque Nacional dos Veadeiros","Goias","1961");
		Parque veadeiros = new ParqueNacional(nomeParque,estado,anoDeCriacao);
		AtracaoTuristica at1 = new AtracaoTuristica(JOptionPane.showInputDialog("Qual é o nome da atraçao ?"));
		AtracaoTuristica at2 = new AtracaoTuristica(JOptionPane.showInputDialog("Qual é o nome da atraçao ?"));
		AtracaoTuristica at3 = new AtracaoTuristica(JOptionPane.showInputDialog("Qual é o nome da atraçao ?"));
		
		veadeiros.cadastrarAtracao(at1);
		veadeiros.cadastrarAtracao(at2);
		veadeiros.cadastrarAtracao(at3);
		veadeiros.listarAtracoes();
		System.exit(0);
	}

}
