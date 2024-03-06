package personnages;

import java.util.Random;

public class Druide {
	// attribut
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePot;

	// constructeur
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		System.out.println(
				"Le druide " + nom + " a un effet potion qui va de " + effetPotionMin + " a " + effetPotionMax);
	}

	// methode
	public String getNom() {
		return nom;
	}

	public int geteffetPotionMin() {
		return effetPotionMin;
	}

	public int geteffetPotionMax() {
		return effetPotionMax;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide " + nom + ": ";
	}

	public int preparerPotion() {
		parler("Je vais aller préparer une petite potion.");
		Random random = new Random();
		forcePot = random.nextInt(effetPotionMin, effetPotionMax);
		if (forcePot > 7) {
			parler("J'ai préparé une super potion de " + forcePot);
			return forcePot;
		} else {
			parler("Je n'avais pas tous les ingrédients ma potion est de seulement " + forcePot);
			return forcePot;
		}
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			parler("Non Obélix!");
		} else {
			gaulois.boirePotion(forcePot);
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		panoramix.preparerPotion();
		panoramix.preparerPotion();
	}

}
