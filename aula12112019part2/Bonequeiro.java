package aula12112019part2;

import java.util.Random;

public class Bonequeiro implements Embriagavel {
	
	private boolean ressaca = false;
	private double taxaDeAlcoolNoSangue;
	private double limiteBebum;
	private int PARAR_DE_BEBER = 7;
	
	public double getTaxaDeAlcoolNoSangue() {
		return taxaDeAlcoolNoSangue;
	}
	 public void setTaxaDeAlcoolNoSangue(double taxaDeAlcoolNoSangue) {
		this.taxaDeAlcoolNoSangue = taxaDeAlcoolNoSangue;
	}
	
	public Bonequeiro() {
		
	}
	
	public Bonequeiro(double limiteBebum) {
		this.limiteBebum = limiteBebum;
	}
	
	public int getConsciencia() {
		Random gerador = new Random();
		return gerador.nextInt(10);
	}
	
	public void naoDirigir() {
		System.out.println("!!Nao Dirigir!!\n"+ 
				"'Artigo 165. Dirigir sob a influência de álcool: Infração – gravíssima; \n"+ 
				" Penalidade – multa (x10) e suspensão do direito de dirigir por 12 meses.'");	
	}
	
	public void tomarEngov() {
		System.out.println("Tomar engov!\n" +
						   "--------------------------------\n");
	}
	
	public void chamarOHugo() {
		System.out.println("uhhhhhhhhhhhhhhg " +
							"(Bateu o arrependimento)");
	}

	@Override
	public void tomarUma(Bebida b) throws EncheuACaraException {
		System.out.println("Tomando so mais essa... \n");
		
		if (taxaDeAlcoolNoSangue > limiteBebum) {
			throw new EncheuACaraException();
			
		}
		
		taxaDeAlcoolNoSangue += b.taxaDeAlcoolPorDose;
		
	}
	
	public void botarBoneco(Bebida b) throws Exception {
			while(getConsciencia() != PARAR_DE_BEBER) {
				try {
					tomarUma(b);
				} catch (EncheuACaraException e) {
					this.ressaca = true;	
					throw new RessacaException();
				
				} finally {
					this.naoDirigir();
				}
				
			}
	}

}
