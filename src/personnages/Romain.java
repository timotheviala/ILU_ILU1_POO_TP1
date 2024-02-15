package personnages;

public class Romain {
	//attribut
	private String nom;
	private int force;
		
	//constructeur
	public Romain(String nom,int force) {
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
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	private String prendreParole() {
		return "Le romain "+ nom +" prend la parole: ";
	}
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}


	public void recevoirCoup(int forceCoup) {
	   force-=forceCoup;
	   if (force>0) {
		System.out.println("Aie j'ai mal");
	} else {
		System.out.println("J'abandonne...");
	}
		
	}
public static void main(String[] args) {
	Romain minus=new Romain("Minus",80);
	minus.recevoirCoup(20);
	}

	

}
