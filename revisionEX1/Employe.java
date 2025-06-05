package revisionEX1;

// Classe abstraite Employé
public abstract class Employe 
{
	// Déclarations des attributs
	protected String nom;
	protected int age;
	
	// Constructeur de la classe 
	public Employe(String nom, int age) 
	{
		this.nom = nom;
		this.age = age;
	}
	
	// Méthode abstraite à implémenter dans les sous-classes
	public abstract double calculeSalaire();
	
	// Méthode concrète qui affiche les informations générales d'un employé
	public void afficherInformation() 
	{
		System.out.println("Nom: " + this.nom + ", Âge: " + this.age);
	}
}
