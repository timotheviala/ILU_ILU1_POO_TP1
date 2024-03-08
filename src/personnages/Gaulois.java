package personnages;

public class Gaulois {
	// attribut
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];


	// constructeur
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// methode
	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

//	public void frapperRomain(Romain romain) {
//		System.out.println("Le gaulois " + nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//
//	}
	
	public void faireUneDonnation(Musee musee) {
		if (trophees!=null) {
			parler("Je donne l'intégralité de mes trophées au musée des Gaulois");
			int i=0;
			while(trophees[i]!=null) {
				if(trophees[i]==Equipement.BOUCLIER) {
					System.out.println("-bouclier"+trophees[i]);
				}else {
					System.out.println("-casque");
				}
				i++;}}		
	}

	@Override
	public String toString() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " prend la parole: ";
//	}

	// debut bug
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapperRomain(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesRecus = romain.recevoirCoup((force / 3) * effetPotion);
		if(tropheesRecus!=null) {
		   int i = 0;
		   while (i < tropheesRecus.length) {
				   this.trophees[nbTrophees] = tropheesRecus[i];
				   nbTrophees += 1;
			
			   i++;
			}
		 }
	}

	// fin bug

	public void boirePotion(int forcePotion) {
		effetPotion =forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Romain minus = new Romain("minus", 3);
		Musee musee=new Musee();
		asterix.boirePotion(11);
		asterix.frapperRomain(minus);
		asterix.faireUneDonnation(musee);

	}

}
