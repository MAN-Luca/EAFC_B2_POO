package revisionEX3;

public class Main 
{
	// Méthode MAIN
	public static void main(String[] args) 
	{
		// Création des objets etudiant et enseignant
		Etudiant etu = new Etudiant("Alice", 20, "E12345");
		Enseignant ens = new Enseignant("Bob", 45, "Mathématiques");
		// AFfichage des infos de l'étudiant et de l'enseignant
		etu.afficherDetails();
		ens.enseigner(); 
	}
}

