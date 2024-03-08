package personnages;

public class Romain {
	// attribut
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	private boolean vainqueur;

	// constructeur
	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	// methode
	

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà protégé!");
			break;
		case 0:
			equipements[0] = equipement;
			nbEquipement += 1;
			System.out.println("Le soldat " + nom + " possède maintenant un " + equipement + "!");
			break;
		default:
			if (equipements[0] == equipement) {
				System.out.println("le soldat " + nom + " possède déjà un " + equipement);
				break;
			} else {
				nbEquipement += 1;
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " possède maintenant un " + equipement + "!");
				break;
			}
		}

	}

	public boolean isVainqueur() {
		return vainqueur;
	}


	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le romain " + nom + " prend la parole: ";
	}
	
	

	public int getNbEquipement() {
		return nbEquipement;
	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force >= 0;
//		int forcVar = force;
//		force -= forceCoup;
//
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//
//		assert forcVar > force;
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
//		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			
		}
		// post condition la force a diminuée
		if (oldForce==force) {
			vainqueur=true;
		};
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement=0;
		if (nbEquipement != 0) {
			String texte2 = "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement+=8;
				} else {
						System.out.println("Equipement casque");
						resistanceEquipement+=5;
				}
			}
			texte += texte2 + resistanceEquipement + "!";
		}
		parler(texte);
		if (resistanceEquipement>=forceCoup){
			forceCoup=0;
			return forceCoup;
		}
		forceCoup-=resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			while (equipements[i] == null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		Gaulois asterix = new Gaulois("asterix",8);
		minus.recevoirCoup(6);
		asterix.frapperRomain(minus);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		System.out.println(minus.getNbEquipement());
        Musee musee=new Musee();
		asterix.faireUneDonnation(musee);
	}

}
