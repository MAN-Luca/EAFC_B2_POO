package tp9.ex8;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Cercle - Rayon : " + rayon);
    }
}
