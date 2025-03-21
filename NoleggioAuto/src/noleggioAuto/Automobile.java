package noleggioAuto;

public class Automobile {

	/*
	 * ho delle auto ho delle persone che noleggiano
	 * 
	 * modello targa noleggiata (true/false)
	 * 
	 * capacitàSerbatoio livelloCarburante
	 * 
	 * numeroPasseggeri passeggeriBordo
	 * 
	 * responsabile? (persona)
	 * 
	 */
	static int numeroAutomobili;
	private String modello;
	private String targa;
	private boolean noleggiata;
	private final int capacitàSerbatoio;
	private int livelloCarburante;
	private final int capacitàPasseggeri;
	private int passeggeri;
	private Persona responsabile;

	public Automobile(String mod, String tar, int capSerb, int capPass) {
		this.modello = mod;
		this.targa = tar;
		this.capacitàSerbatoio = capSerb;
		this.capacitàPasseggeri = capPass;
		numeroAutomobili ++;

	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public boolean getNoleggiata() {
		return noleggiata;
	}

	public void setNoleggiata(boolean noleggiata) {
		this.noleggiata = noleggiata;
	}

	public int getLivelloCarburante() {
		return livelloCarburante;
	}

	public void setLivelloCarburante(int rifornimento) {

		// se il livello attuale più il carburante che sto mettenndo superano la
		// capacità massima allora mi fermo;
		// altrimenti non lo superano metto quanto ho definito all'inzio; lvl
		// carburante+quello inserito
		if (this.livelloCarburante + rifornimento < this.capacitàSerbatoio) {
			this.livelloCarburante += rifornimento;
		} else {
			this.livelloCarburante = capacitàSerbatoio;
			System.out.println("hai fatto il pieno non entra più");
		}

	}

	public int getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(int nuovipasseggeri) {
		if (this.passeggeri + nuovipasseggeri < this.capacitàPasseggeri) {
			this.passeggeri += nuovipasseggeri;
		} else {
			this.passeggeri = this.capacitàPasseggeri;
			System.out.println("La macchina è piena, non entrano più passeggeri");
		}
	}

	public Persona getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(Persona responsabile) {
		this.responsabile = responsabile;
	}

	public int getCapacitàSerbatoio() {
		return capacitàSerbatoio;
	} // per le costanti (final) viene dato solo il get perche non cambiano nel tempo

	public int getCapacitàPasseggeri() {
		return capacitàPasseggeri;
	}

	public static int getNumeroAutomobili() {
		return numeroAutomobili;
	}

}