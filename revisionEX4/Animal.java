package revisionEX4;

public abstract class Animal {
	 protected String nom;
	 public Animal(String nom) {
		 this.nom = nom;
	 }
	 
	 public abstract void crier();
	 public void manger() {
		 System.out.println("L'animal mange");
	 }
}
