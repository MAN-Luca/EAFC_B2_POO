package tp9.ex9;

public class Livre extends Document 
{
    private int nbPages;

    public Livre(String titre, String auteur, int nbPages) 
    {
        super(titre, auteur);
        this.nbPages = nbPages;
    }

    @Override
    public void afficherType() 
    {
        System.out.println("Type: Livre");
    }

    @Override
    public void afficherDetails() 
    {
        super.afficherDetails();
        System.out.println("Nombre de pages: " + nbPages);
    }
}