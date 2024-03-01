package personnages;

public class Village {

	// attribut
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	// constructeur
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	// methode

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
		} else {
			System.out.println("Village rempli!");

		}
	}

	public Gaulois trouverHabitant(int placeDansVillage) {
		return (villageois[placeDansVillage]);
	}

	public void afficherVillageois(Village village) {
		System.out.println("Dans le village d'" + village.getChef() + " vivent les gaulois:");
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i] != null) {
				System.out.println("-" + villageois[i]);
			}

		}

	}

	@Override
	public String toString() {
		return "Village [chef=" + chef + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Chef getChef() {
		return chef;
	}

	public static void main(String args[]) {
		Village village = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois=village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix", 8, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(village);
	}

}
