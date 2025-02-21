package miniProjet;

public class Voiture extends Vehicule
{
	private int nPlaces;

	public Voiture(String numeroIM, String marque, String modele, int annee, double kilometrage, int nPlaces)
	{
		super(numeroIM, marque, modele, annee, kilometrage);
		this.nPlaces = nPlaces;
	}
	
	@Override
	public void afficherDetails() 
	{
		System.out.println("Voiture : " + this.numeroIM);
		System.out.println("\tMarque : " + this.marque);
		System.out.println("\tModèle : " + this.modele);
		System.out.println("\tAnnée : " + this.annee);
		System.out.println("\tKilométrage : " + this.kilometrage);
		System.out.println("\tNombre de places : " + this.nPlaces);
	}

	public int getnPlaces() {return nPlaces;}
	public void setnPlaces(int nPlaces) {this.nPlaces = nPlaces;}
}
