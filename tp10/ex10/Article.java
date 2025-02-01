package tp10.ex10;

public class Article extends Document 
{
    private String nomMagazine;

    public Article(String titre, String auteur, String nomMagazine) 
    {
        super(titre, auteur);
        this.nomMagazine = nomMagazine;
    }

    @Override
    public void afficherType() 
    {
        System.out.println("Type : Article");
        System.out.println("Titre : " + titre + ", Auteur : " + auteur + ", Magazine : " + nomMagazine);
    }
}
