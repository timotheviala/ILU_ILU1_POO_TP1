package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Musee;
import personnages.Romain;

//public class Scenario {
//
//	public static void main(String[] args) {
//		Druide panoramix=new Druide("Panoramix",5,10);
//		int forcePot=panoramix.preparerPotion();
//	    Gaulois obelix=new Gaulois("Obélix",25);
//		Gaulois asterix=new Gaulois("Astérix",8);
//		Romain minus=new Romain("Minus",6);
//		panoramix.booster(obelix);
//		obelix.parler("Ce n'est pas juste!");
//		asterix.boirePotion(forcePot);
//		asterix.parler("Bonjour à tous!");
//		minus.parler("UN GAU...UN GAUGAU...");
//		asterix.frapperRomain(minus);
//	}
//
//}

//import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapperRomain(minus);
		} while (minus.getForce() > 0 && minus.isVainqueur()!=true);
		if (minus.isVainqueur()==true){
			minus.parler("J'ai gagné contre un gaulois!");
		}
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapperRomain(milexcus);
		} while (milexcus.getForce() > 0 && minus.isVainqueur()!=true);
		if (milexcus.isVainqueur()==true) {
			milexcus.parler("J'ai gagné contre un gaulois!");
		}
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);

	}

}