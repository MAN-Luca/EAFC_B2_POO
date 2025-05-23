package revisionEX4;

public class Chat extends Animal {

	public Chat(String nom) {
		super(nom);
	}

	@Override
	public void crier() {
		System.out.println("Le chat miaule");
	}
	public void grimperArbre(int hauteur) {
		if (hauteur < 0) {
			System.out.println("ERREUR HAUTEUR NEGATIVE");
		} else {
			System.out.println(nom + " grimpe à " + hauteur + " mètres.");
		}
	}
}
