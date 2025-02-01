package tp10.ex8;

public class Cercle extends Forme 
{
    private double rayon;

    public Cercle(double rayon) 
    {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() 
    {
        return Math.PI * rayon * rayon;
    }
}
