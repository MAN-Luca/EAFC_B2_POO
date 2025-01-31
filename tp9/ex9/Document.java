package tp9.ex9;

public abstract class Document 
{
    protected String titre;
    protected String auteur;

    public Document(String titre, String auteur) 
    {
        this.titre = titre;
        this.auteur = auteur;
    }

    public abstract void afficherType();

    public void afficherDetails() 
    {
        System.out.println("Titre: " + titre + ", Auteur: " + auteur);
    }
}
