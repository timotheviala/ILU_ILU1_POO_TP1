package personnages;

public class Trophee {
	//attribut
	private Gaulois gaulois;
	private Equipement equipement;
	
	
	
	//methode
	public Gaulois getGaulois() {
		return gaulois;
	}
	public Equipement getEquipement() {
		return equipement;
	}
	
	public String donnerNom() {
		return gaulois.getNom();
	}
	
	
	
	//constructeur
	public Trophee(Gaulois gaulois,Equipement equipement) {
		this.gaulois=gaulois;
		this.equipement=equipement;
	}

}
