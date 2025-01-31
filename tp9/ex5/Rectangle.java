package tp9.ex5;

public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Rectangle - Longueur : " + longueur + ", Largeur : " + largeur);
    }
}
