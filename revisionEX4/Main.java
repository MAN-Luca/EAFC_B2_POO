package revisionEX4;

public class Main 
{
	// Méthode MAIN
	public static void main(String[] args) 
	{
		// Création d'un tableau pour stocker les animaux (longueur = 2)
		Animal[] animaux = new Animal[2];
		animaux[0] = new Chien("Rex"); // Premier animal du tableau est un chien
		animaux[1] = new Chat("Mimi"); // Second animal du tableau est un chat
		// Parcourt le tableau en entier
		for (Animal animal : animaux) 
		{
			// Méthode crier commune à tous les animaux
			animal.crier();
			// Vérification du type d'animal
			if (animal instanceof Chien) // Si l'animal est un chien alors il peut rapporter la balle
			{
				((Chien) animal).rapporterBalle(); // Cast de l'animal en chien pour utiliser sa méthode spécifique
			}
			if (animal instanceof Chat) // Si l'animal est un chat alors il peut grimper à l'arbre
			{
				((Chat) animal).grimperArbre(5); // Cast de l'animal en chat pour utiliser sa méthode spécifique
			}
		}
	}
}

