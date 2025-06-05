package revisionEX4;

//Classe abstraite Animal
public abstract class Animal 
{
	// Déclaration des attributs
	protected String nom;
	
	// Constructeur de la classe
	public Animal(String nom) 
	{
		this.nom = nom;
	}
	 
	// Méthode abstraite à implémenter dans les sous-classes
	public abstract void crier();
	// Méthode concrète de la classe mère
	public void manger() 
	{
		System.out.println("L'animal mange");
	}
}
