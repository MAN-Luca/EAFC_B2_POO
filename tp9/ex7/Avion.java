package tp9.ex7;

public class Avion extends Vehicule_abstract
{
	public Avion(String marque, String modele)
	{
		super(marque, modele);
	}
	
	@Override
	public void deplacer()
	{
		System.out.println("L'avion vole dans les airs...");
	}
}
