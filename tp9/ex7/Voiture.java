package tp9.ex7;

public class Voiture extends Vehicule_abstract
{
	
	public Voiture(String marque, String modele)
	{
		super(marque, modele);
	}
	
	@Override
	public void deplacer()
	{
		System.out.println("La voiture roule sur la terre...");
	}
}
