package revisionEX3;

public class Main {

	public static void main(String[] args) {
		Etudiant etu = new Etudiant("Alice", 20, "E12345");
		Enseignant ens = new Enseignant("Bob", 45, "Mathématiques");
		etu.afficherDetails();
		ens.enseigner(); 
	}
}

