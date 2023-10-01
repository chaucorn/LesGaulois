package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef; 
	private int nbVillageois;
	private Gaulois[] villageois; 
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
		nbVillageois = 0;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++; 
	}
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public void afficherVillageois (Village monVillage) {
		Chef monChef = monVillage.chef;
		String chefNom = monChef.getNom(); /// why not monChef.nom
		System.out.println("Dans village du chef " + chefNom + " vivent les légendaires gaulois:");
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois habitant = villageois[i];
			String habitantNom = habitant.getNom();
			System.out.println("-" +habitantNom);
		}
	}
	
	public static void main(String[] args) {
			
			Village newVillage = new Village("Village des Irreductibles", 30);
			Chef abra = new Chef("Abraracourcix", 6, newVillage);
			newVillage.setChef(abra);
			Gaulois ast =  new Gaulois("Asterix", 8);
			newVillage.ajouterHabitant(ast);
			Gaulois obe = new Gaulois("Obelix", 25);
			newVillage.ajouterHabitant(obe);
			// Gaulois gaulois = newVillage.trouverHabitant(1);
			// System.out.println(gaulois);
			// Print a null value because we only have initiated 1 habitant in the village
			// Change to 0 to get the result :
			// Gaulois [nom=Asterix, force=8, effetPotion=1]
			newVillage.afficherVillageois(newVillage);
			
	}
	
	
	
	
	
	


}
