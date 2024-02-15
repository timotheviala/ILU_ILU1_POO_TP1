package personnages;

public class Druide {
	//attribut
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	//constructeur
	public Druide(String nom,int effetPotionMin,int effetPotionMax) {
		this.nom=nom;
		this.effetPotionMin=effetPotionMin;
		this.effetPotionMax=effetPotionMax;
		System.out.println("Le druide "+ nom+ "a un effet potion qui va de "+effetPotionMin+" a"+effetPotionMax);
	}
	
	//methode
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
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	private String prendreParole() {
		return "Le druide "+ nom +" prend la parole";
	}
	
	
	
}
