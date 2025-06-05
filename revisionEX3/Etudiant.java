package revisionEX3;

//Classe qui hérite de la classe Personne
public class Etudiant extends Personne 
{
	// Attribut spécifique à Etudiant
	private String numeroEtudiant;
	
	// Constructeur de la classe
	public Etudiant(String nom, int age, String numeroEtudiant) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom, age);
		this.numeroEtudiant = numeroEtudiant;
	}
	
	// Méthode qui affiche les détails d'un étudiant
	public void afficherDetails() 
	{
		 System.out.println("Nom: " + this.getNom()+ ", Âge: " + this.getAge() + ", Numéro étudiant: " + this.numeroEtudiant);
	}
}
