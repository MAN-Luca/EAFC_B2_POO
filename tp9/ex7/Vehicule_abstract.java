package tp9.ex7;

public abstract class Vehicule_abstract
{
	protected String marque;
	protected String modele;
	
	public Vehicule_abstract(String marque, String modele)
	{
		this.marque = marque;
		this.modele = modele;
	}
	
	public abstract void deplacer();
	
	public void afficherDetails() 
	{
		System.out.println("Marque : " + this.marque + "\n" + "Modèle : " + this.modele);
		System.out.println("===========================");
	}
	
	
}
