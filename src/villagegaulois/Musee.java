package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;
import personnages.Trophee;

public class Musee {
	private Trophee[] mesTrophees;
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		mesTrophees[nbTrophee] = equipement;
	}

}
