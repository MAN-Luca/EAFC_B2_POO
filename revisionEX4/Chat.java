package revisionEX4;

//Classe qui hérite de la classe Animal
public class Chat extends Animal 
{
	// Constructeur de la classe
	public Chat(String nom) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom);
	}
	
	// Implémentation de la méthode abstraite 
	@Override
	public void crier() 
	{
		System.out.println("Le chat miaule");
	}
	
	// Méthode concrète spécifique aux chats
	public void grimperArbre(int hauteur) 
	{
		if (hauteur < 0) // Si la hauteur est négative ça affiche une erreur
		{
			System.out.println("ERREUR HAUTEUR NEGATIVE");
		} 
		else // Sinon par d'erreur et ça affiche un message
		{
			System.out.println(nom + " grimpe à " + hauteur + " mètres.");
		}
	}
}
