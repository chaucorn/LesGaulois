package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Equipement getEquipement( ) {
		return equipement;
	}
	
	// Methode retourne le nom du gaulois
	public String donnerNom() {
		return gaulois.getNom();
	}
	
	
}


