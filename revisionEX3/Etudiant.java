package revisionEX3;

public class Etudiant extends Personne {
	private String numeroEtudiant;
	
	public Etudiant(String nom, int age, String numeroEtudiant) {
		super(nom, age);
		this.numeroEtudiant = numeroEtudiant;
	}
	
	public void afficherDetails() {
		 System.out.println("Nom: " + this.getNom()+ ", Âge: " + this.getAge() + ", Numéro étudiant: " + this.numeroEtudiant);
	}
}
