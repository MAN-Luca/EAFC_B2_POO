package tp10.ex3;

public class Voiture extends Vehicule
{
	
	private int nombrePortes;
	
	public Voiture(String marque, int vitesse, int nombrePortes)
	{
		super(marque, vitesse);
		this.nombrePortes = nombrePortes;
	}
	
	public void afficherDetails()
	{
		System.out.println("Marque : " + this.marque + "\nVitesse : " + this.vitesse + " km/h\nNombre de portes : " + this.nombrePortes);
		System.out.println("===============================");
	}
	
}
