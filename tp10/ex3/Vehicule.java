package tp10.ex3;

public class Vehicule
{
	protected String marque;
	protected int vitesse;
	
	public Vehicule(String marque, int vitesse)
	{
		this.marque = marque;
		this.vitesse = vitesse;
	}
	
	public void afficheInfos()
	{
		System.out.println("Marque : " + this.marque + "\nVitesse : " + this.vitesse + " km/h");
		System.out.println("===============================");
	}
	
}
