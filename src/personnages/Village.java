package personnages;

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
	
	public static void main(String[] args) {
			
			Village newVillage = new Village("Village des Irréductibles", 30);
			Chef abra = new Chef("Abra", 6, newVillage);
			newVillage.setChef(abra);
			Gaulois ast =  new Gaulois("Asterix", 8);
			newVillage.ajouterHabitant(ast);
			Gaulois gaulois = newVillage.trouverHabitant(0);
			System.out.println(gaulois);
			
			
	}
	
	
	
	
	


}
