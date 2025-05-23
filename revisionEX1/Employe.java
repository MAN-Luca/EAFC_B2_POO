package revisionEX1;

public abstract class Employe {
	protected String nom;
	protected int age;
	
	public Employe(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public abstract double calculeSalaire();
	
	public void afficherInformation() {
		System.out.println("Nom: " + this.nom + ", Âge: " + this.age);
	}
}
