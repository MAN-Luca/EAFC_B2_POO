package tp9.ex8;

public class Carre extends Forme
{
	private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerAire() {
        return this.cote * this.cote;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Carré - Côté : " + this.cote);
    }
}
