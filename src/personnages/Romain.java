package personnages;

import javax.print.attribute.standard.Chromaticity;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquiment; 
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force est positive a la creation"; 
		this.force = force;
		this.equipements = new Equipement[2];
		nbEquiment = 0;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "La force est negative avant revecoir un coup";
		int avantCoup = force;
		force -= forceCoup;
		assert force < avantCoup : "La force n'est pas diminuee"; 
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public int getForce() {
        return force;
    }
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquiment) {
		case 2: 
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
	
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement.getNom() + " !");
			} else{
				equipements[1] = equipement;
				nbEquiment++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
			}
			break;
		case 0:
			equipements[0] = equipement;
			nbEquiment++;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println("La force de Minus est " + minus.getForce());
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
		
	

		
	}
}
