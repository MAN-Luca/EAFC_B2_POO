package tp6.ex1;

public class Rectangle {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) 
	{
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double surface() {
		return this.longueur * this.largeur;
	}
	
	public double perimetre() {
		return 2 * (this.longueur + this.largeur);
	}
	
	public void affiche_infos() {
		System.out.println("Rectangle : \n\tLongueur : " + this.getLongueur() + "\n\tLargeur " + this.getLargeur() + "\n\tSurface = " + this.surface() + "\n\tPerimètre = " + this.perimetre());
	}
	

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	
}
