package tp9.ex7;

public class MainVehicule
{

	public static void main(String[] args)
	{
		Vehicule_abstract avion = new Avion("Lockheed Martin", "F-22 Raptor");
		Vehicule_abstract voiture = new Voiture("Citroën", "C1");
		
		avion.afficherDetails();
		voiture.afficherDetails();
	}

}
