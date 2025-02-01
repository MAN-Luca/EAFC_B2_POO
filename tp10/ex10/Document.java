package tp10.ex10;

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
}
