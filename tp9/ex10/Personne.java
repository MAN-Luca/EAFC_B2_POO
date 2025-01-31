package tp9.ex10;

public abstract class Personne 
{

    protected String nom;
    protected int id;


    public Personne(String nom, int id) 
    {
        this.nom = nom;
        this.id = id;
    }


    public abstract void afficherRole();


    public void afficherDetails() 
    {
        System.out.println("Nom: " + nom);
        System.out.println("ID: " + id);
    }
}
