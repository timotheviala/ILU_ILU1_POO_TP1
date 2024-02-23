package histoire;
import personnages.Gaulois;
import personnages.*;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix=new Druide("Panoramix",5,10);
		int forcePot=panoramix.preparerPotion();
	    Gaulois obelix=new Gaulois("Obélix",25);
		Gaulois asterix=new Gaulois("Astérix",8);
		Romain minus=new Romain("Minus",6);
		panoramix.booster(obelix);
		obelix.parler("Ce n'est pas juste!");
		asterix.boirePotion(forcePot);
		asterix.parler("Bonjour à tous!");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapperRomain(minus);
	}

}
