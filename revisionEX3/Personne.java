package revisionEX3;

public class Personne {
	// Déclaration des attributs
	private String nom;
	private int age;
	
	// Constructeur de la classe
	public Personne(String a, int b) {
		this.nom = a;
		this.age = b;
	}
	
	// Getter pour le nom
	public String getNom() {
		return this.nom;
	}
	// Getter pour l'age
	public int getAge() {
		return this.age;
	}
	// Setter pour l'age avec vérification
	public void setAge(int age) {
		// Fonctionne seulement si l'age est positif
		if (age > 0) {
			this.age = age;
		}
	}
}
