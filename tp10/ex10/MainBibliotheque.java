package tp10.ex10;

public class MainBibliotheque
{

	public static void main(String[] args) 
	{
        // Création d'un tableau de documents avec polymorphisme
        Document[] bibliotheque = 
        {
            new Livre("1984", "George Orwell", 328),
            new Article("L'IA en 2025", "Jean Dupont", "Science & Vie")
        };

        // Affichage des documents
        for (Document doc : bibliotheque) 
        {
            doc.afficherType();
            System.out.println(); // Saut de ligne pour la lisibilité
        }
    }

}
