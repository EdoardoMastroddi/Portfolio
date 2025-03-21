package Ospedale;

public class Dottore {
		
		String nome;
		String cognome;
		int eta;
		boolean lavoraInOspedale;
		
		public Dottore (String n, String c) {
			this.nome=n;
			this.cognome=c;
		}
		
		public String toString() {
			return  "Sono un dottore, mi chiamo " + this.nome + " " + this.cognome;
		}

}
