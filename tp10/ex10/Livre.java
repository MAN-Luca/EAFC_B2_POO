package tp10.ex10;

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
        System.out.println("Type : Livre");
        System.out.println("Titre : " + titre + ", Auteur : " + auteur + ", Pages : " + nbPages);
    }
}
