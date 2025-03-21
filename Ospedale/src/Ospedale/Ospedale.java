package Ospedale;

public class Ospedale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dottore Gianni = new Dottore ("Gianni", "Rossi");
		System.out.println(Gianni);
		
		MedicoDiBase Maria = new MedicoDiBase("Maria", "Gialli", true);
		System.out.println(Maria);
	}

}
