package revisionEX4;

public class Chien extends Animal {

	
	public Chien(String nom) {
		super(nom);
		
	}

	@Override
	public void crier() {
		System.out.println("Le chien abboie");
	}

	
	public void rapporterBalle() {
		System.out.println("Le chien rapporte la balle");
	}

}
