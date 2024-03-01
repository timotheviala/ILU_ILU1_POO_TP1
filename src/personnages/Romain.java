package personnages;

public class Romain {
	// attribut
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

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
		case 1:
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

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0;
		int forcVar = force;
		force -= forceCoup;

		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}

		assert forcVar > force;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(20);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

	}

}
