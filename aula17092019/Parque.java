package aula17092019inputoutput;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Parque {
	String nome;
	String estado;
	String anoDeCriacao;
	private ArrayList<AtracaoTuristica> atracoes;
	public Parque() {
		this.atracoes = new ArrayList<>();
	}
	public Parque(String nome,String estado,String anoDeCriacao) {
		this();
		this.nome = nome;
		this.estado = estado;
		this.anoDeCriacao = anoDeCriacao;
		
	}
	public boolean cadastrarAtracao(AtracaoTuristica atracao) {
		if(atracao == null) {
			return false;
		}else {
			this.atracoes.add(atracao);
			return true;
		}
		
	}
	public void listarAtracoes() {
		//System.out.println(this.nome);
		JOptionPane.showMessageDialog(null, this.nome);
		System.exit(0);
		for(AtracaoTuristica at: this.atracoes) {
			at.exibir();
		}
	}
	

}
