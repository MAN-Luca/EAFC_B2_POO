package miniProjet;

public class Camion extends Vehicule
{
	private double capaciteCharg;

	public Camion(String numeroIM, String marque, String modele, int annee, double kilometrage, double capaciteCharg)
	{
		super(numeroIM, marque, modele, annee, kilometrage);
		this.capaciteCharg = capaciteCharg;
	}
	
	@Override
	public void afficherDetails() 
	{
		System.out.println("Camion : " + this.numeroIM);
		System.out.println("\tMarque : " + this.marque);
		System.out.println("\tModèle : " + this.modele);
		System.out.println("\tAnnée : " + this.annee);
		System.out.println("\tKilométrage : " + this.kilometrage);
		System.out.println("\tCapacité de chargement : " + this.capaciteCharg);
	}

	public double getCapaciteCharg() {return capaciteCharg;}
	public void setCapaciteCharg(double capaciteCharg) {this.capaciteCharg = capaciteCharg;}
}
