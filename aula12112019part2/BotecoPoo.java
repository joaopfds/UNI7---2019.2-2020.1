package aula12112019part2;

public class BotecoPoo {
	public static void main(String[] args) {
		Bonequeiro bebum = new Bonequeiro(11);
		
		bebum.setTaxaDeAlcoolNoSangue(10);
		
		System.out.println(bebum.getConsciencia());
		
		Bebida vodka = new Bebida(12);
		Bebida cerveja = new Bebida(3);
		try {
			bebum.botarBoneco(vodka);
		} catch (Exception  e) {
			bebum.tomarEngov();
		}
		
		try {
			bebum.botarBoneco(cerveja);
		} catch ( Exception e) {
			bebum.tomarEngov();
		}
	}

}
