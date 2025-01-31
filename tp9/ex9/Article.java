package tp9.ex9;

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
        System.out.println("Type: Article");
    }

    @Override
    public void afficherDetails() 
    {
        super.afficherDetails();
        System.out.println("Magazine: " + nomMagazine);
    }
}