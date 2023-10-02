package personnages;

public enum Equipement {
	CASQUE("casque"),
	BOUCLIER("bouclier");
	private String nom;
	
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
        return nom;
    }
	
	public String toString() {
		return nom;
	}
	public static void main(String[] args) {
	    Equipement equipement1 = Equipement.CASQUE;
	    Equipement equipement2 = Equipement.BOUCLIER;

	    // Utilisation de la méthode toString
	    System.out.println("Equipement 1 (toString) : " + equipement1.toString());
	    System.out.println("Equipement 2 (toString) : " + equipement2.toString());
	}
}


