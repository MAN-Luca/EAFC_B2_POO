package tp9.ex10;

public class Etudiant extends Personne 
{
    private String niveau;

    public Etudiant(String nom, int id, String niveau) 
    {
        super(nom, id);
        this.niveau = niveau;
    }


    @Override
    public void afficherRole() {
        System.out.println("Rôle: Etudiant");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Niveau: " + niveau);
    }
}