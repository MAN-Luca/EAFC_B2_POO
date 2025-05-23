package revisionEX4;

public class Main {

	public static void main(String[] args) {
		 Animal[] animaux = new Animal[2];
		 animaux[0] = new Chien("Rex");
		 animaux[1] = new Chat("Mimi");
		 for (Animal animal : animaux) {
			 animal.crier();
			 // Appel incorrect intentionnel à corriger (polymorphisme)
			 if (animal instanceof Chien) {
				 ((Chien)animal).rapporterBalle();
			 }
			 if (animal instanceof Chat) {
				 ((Chat)animal).grimperArbre(5);
			 }
		 }
	}
}

