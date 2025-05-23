package revisionEX3;

public class Enseignant extends Personne {
	
	private String matiere;
	
	public Enseignant(String nom, int age, String matiere) {
		 super(nom, age);
		 this.matiere = matiere;
	 }
	
	 public void enseigner() {
		 System.out.println("Nom: " + this.getNom() + ", Âge: " + this.getAge() + ", Cours donné: " + this.matiere);
	 }

}
