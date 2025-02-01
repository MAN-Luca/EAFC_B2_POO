package tp10.ex7;

public class MainGestionVehicules
{
	public static void main(String[] args)
	{
		Vehicule[] liste = 
			{
					new Avion(),
					new Voiture(),
					new Bateau()
			};
		
		for (Vehicule v : liste)
		{
			v.deplacer();
		}
	}
}
