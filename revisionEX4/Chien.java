package revisionEX4;

//Classe qui hérite de la classe Animal
public class Chien extends Animal 
{
	// Constructeur de la classe
	public Chien(String nom) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom);
	}

	// Implémentation de la méthode abstraite 
	@Override
	public void crier() 
	{
		System.out.println("Le chien abboie");
	}

	// Méthode concrète spécifique aux chiens
	public void rapporterBalle() {
		System.out.println("Le chien rapporte la balle");
	}

}
