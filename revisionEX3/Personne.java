package revisionEX3;

public class Personne {
	private String nom;
	private int age;
	
	public Personne(String a, int b) {
		this.nom = a;
		this.age = b;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}
}
