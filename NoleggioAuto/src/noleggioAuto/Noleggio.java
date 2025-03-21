package noleggioAuto;

public class Noleggio {
	/*
	 * definisco un array di automobili definisco una persona creo un metodo per il
	 * noleggio creo un metodo per la riconsegna
	 * 
	 */
	private Automobile[] listaAuto = new Automobile[3];

	// String mod, String tar, int capSerb, int capPass
	public Noleggio() {
		Automobile fiatPanda = new Automobile("Fiat Panda", "FR345TR", 40, 4);
		Automobile citroen = new Automobile("Citroen Cactus", "TR546RE", 50, 5);
		Automobile ferrari = new Automobile("Ferrari F340", "AE345TY", 70, 2);

		listaAuto[0] = fiatPanda;
		listaAuto[1] = citroen;
		listaAuto[2] = ferrari;

	}

	public boolean doNoleggio(int i, Persona cliente) {

		if (cliente.getPatente()) { // contralla se il cliente ha la patente

			if (i >= 0 && i < listaAuto.length) { // // Controlla se l'indice è valido (deve essere compreso tra 0 e la
													// lunghezza dell'array - 1)

				if (!listaAuto[i].getNoleggiata()) { // Controlla se l'auto alla posizione i non è già stata noleggiata
					listaAuto[i].setNoleggiata(true); // Imposta lo stato dell'auto come "noleggiata"
					listaAuto[i].setResponsabile(cliente);// Assegna il cliente come responsabile del noleggio dell'auto
					return true; // Il noleggio è andato a buon fine, quindi restituisce true
				}
			}
		}
		return false;
	}

	public boolean riconsegna(int i) { // Metodo per la riconsegna dell'auto.
		if (i >= 0 && i < listaAuto.length) { // Controlla se l'indice è valido
			listaAuto[i].setNoleggiata(false); // Imposta lo stato dell'auto come "non noleggiata"
			return true; // La riconsegna è avvenuta con successo, quindi restituisce true
		}
		return false; // Se la riconsegna non è possibile (indice non valido), restituisce false
	}

	public static void main(String[] args) {

		Noleggio daFrancesco = new Noleggio(); // Creazione di un'istanza della classe Noleggio, che gestisce il parco
												// auto

		Persona mario = new Persona("Mario", "Rossi"); // Creazione di due persone: Mario e Luca // Luca viene creato
														// con nome, cognome, età (23 anni) e ha la patente (true)
		Persona luca = new Persona("Luca", "Verdi", 23, true); // Mario viene creato senza età e senza patente
																// (probabilmente il costruttore lo imposta così di
																// default)

		if (daFrancesco.doNoleggio(0, mario)) { // Mario prova a noleggiare l'auto con indice 0 (Fiat Panda)

			System.out.println(mario.getNome() + "ha noleggiato");// Se il noleggio è riuscito, stampa il messaggio di
																	// conferma
		} else {
			System.out.println(mario.getNome() + " non ha noleggiato");// Se il noleggio fallisce, stampa il messaggio
																		// di errore
		}
		if (daFrancesco.doNoleggio(2, luca)) { // Luca prova a noleggiare l'auto con indice 2 (Ferrari F340)
			System.out.println(luca.getNome() + " ha noleggiato"); // Se il noleggio è riuscito, stampa il messaggio di
																	// conferma
		} else {
			System.out.println(mario.getNome() + " non ha noleggiato"); // Se il noleggio fallisce, stampa il messaggio
																		// di errore

		}
		if (daFrancesco.doNoleggio(5, luca)) { // Luca prova a noleggiare un'auto con indice 5, che non esiste (indice
												// fuori dai limiti)
			System.out.println(luca.getNome() + " ha noleggiato"); // Se il noleggio fosse riuscito (ma non può
																	// accadere), stamperebbe questo messaggio
		} else {
			System.out.println(luca.getNome() + " non ha noleggiato"); // Poiché l'indice è fuori dai limiti, il
																		// noleggio fallisce e viene stampato questo
																		// messaggio
		}

		mario.setPantente(true); // Mario ora ottiene la patente
		if (daFrancesco.doNoleggio(1, mario)) { // Mario prova di nuovo a noleggiare un'auto con indice 1 (Citroen
												// Cactus)
			System.out.println(mario.getNome() + " ha noleggiato");// Se il noleggio è riuscito, stampa il messaggio di
																	// conferma
		} else {
			System.out.println(mario.getNome() + " non ha noleggiato");// Se il noleggio fallisce, stampa il messaggio
																		// di errore
		}
			System.out.println(Automobile.getNumeroAutomobili());
	}

}
