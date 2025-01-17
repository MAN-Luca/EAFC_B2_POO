package tp6.ex2;

public class Voiture {
	private String marque;
	private String modele;
	private double vitesse = 0;
	
	public Voiture(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}
	
	public void add_vitesse(double val) {
		this.vitesse += val;
	}
	public void freiner(double val) {
		this.vitesse -= val;
	}
	
	public void afficher() {
		System.out.println("Voiture :\n\tMarque : " + this.marque + "\n\tModèle : " + this.modele + "\n\tVitesse actuelle : " + this.vitesse);
	}
}
