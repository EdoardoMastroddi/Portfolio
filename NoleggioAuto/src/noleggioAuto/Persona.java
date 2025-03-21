package noleggioAuto;

public class Persona {
	/*
	 * modellare passeggeri >persona
	 * 
	 * nome cognome età patente
	 * 
	 * 
	 */

	private String nome, cognome;
	private int eta;
	private boolean patente;

	public Persona(String nm, String cn, int et, boolean pat) {
		this.nome = nm;
		this.cognome = cn;
		this.eta = et;
		this.patente = pat;
	}

	public Persona(String nm, String cn) {
		this.nome = nm;
		this.cognome = cn;
		this.patente = false;
	}

	public boolean getPatente() {
		return this.patente;
	}

	public void setPantente(boolean pat) {
		this.patente = pat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
}
