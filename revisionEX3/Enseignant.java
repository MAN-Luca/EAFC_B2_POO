package revisionEX3;

//Classe qui hérite de la classe Personne
public class Enseignant extends Personne 
{
	// Attribut spéficique à enseignant
	private String matiere;
	
	// Constructeur de la classe
	public Enseignant(String nom, int age, String matiere) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom, age);
		this.matiere = matiere;
	}
	
	// Méthode qui affiche les détails d'un enseignant
	public void enseigner() 
	{
		System.out.println("Nom: " + this.getNom() + ", Âge: " + this.getAge() + ", Cours donné: " + this.matiere);
	}

}
