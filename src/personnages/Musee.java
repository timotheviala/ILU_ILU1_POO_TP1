package personnages;


public class Musee {
	
	//attribut
	private Equipement[] trophees=new Equipement[200];
	private int nbTrophee=0;
	
	//methode
	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		trophees[nbTrophee]=equipement;
		nbTrophee++;
	}

	
	
	//constructeur
    
}
