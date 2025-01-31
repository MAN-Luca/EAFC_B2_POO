package tp9.ex8;

public class Triangle extends Forme
{
	private double base;
	private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerAire() {
        return (this.base * this.hauteur) / 2;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Triangle - Base : " + this.base + " Hauteur : " + this.hauteur );
    }
}
