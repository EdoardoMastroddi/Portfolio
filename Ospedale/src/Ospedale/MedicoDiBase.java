package Ospedale;

public class MedicoDiBase extends Dottore {
	
	
	Boolean faVisiteADomicilio;

	public MedicoDiBase(String n, String c, boolean visite) {
		super(n, c);
		this.faVisiteADomicilio = visite;
	}
		
		public String toString() {
			if (this.faVisiteADomicilio) 
				return super.toString() + " ed effettuo visite a domicilio";
				else
					return super.toString() + " e non effettuo visite a domicilio";
			
		}
		
	}


