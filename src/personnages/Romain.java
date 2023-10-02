package personnages;

import javax.print.attribute.standard.Chromaticity;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		
//		if (force >= 0) {
//			this.force = force;
//		} else {
//			throw new IllegalArgumentException("La force doit etre positive");
//		}
		assert force >= 0 : "La force est positive a la creation"; 
		this.force = force;
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
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println("La force de Minus est " + minus.getForce());
		
	}
}
