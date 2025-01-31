package tp9.ex9;

public class MainBibliotheque
{

	public static void main(String[] args)
	{
		Document[] documents = new Document[] 
		{
            new Livre("Les Misérables", "Victor Hugo", 1232),
            new Article("L'IA en 2024", "Jean Dupont", "Science & Vie"),
            new Livre("1984", "George Orwell", 328)
	    };

	    for (Document doc : documents) 
	    {
            doc.afficherType();
            doc.afficherDetails();
            System.out.println();
	    }
	}
}
