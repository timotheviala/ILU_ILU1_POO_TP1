package personnages;

public class Gaulois {
	//attribut
	private String nom;
	private int force;
	private int effetPotion=1;
	
	//constructeur
	public Gaulois(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	
	//methode
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	
	public void frapperRomain(Romain romain) {
		System.out.println("Le gaulois "+nom+" envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(force/3);
		
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}	
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	private String prendreParole() {
		return "Le gaulois "+ nom +" prend la parole: ";
	}
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("asterix",8);
		Romain minus=new Romain("minus",80);
		asterix.frapperRomain(minus);
		asterix.parler("Coucou");
	}

}
