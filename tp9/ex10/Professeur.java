package tp9.ex10;

public class Professeur extends Personne {
    private double salaire;

    public Professeur(String nom, int id, double salaire) {
        super(nom, id);
        this.salaire = salaire;
    }

    @Override
    public void afficherRole() {
        System.out.println("Rôle: Professeur");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Salaire: " + salaire + "€");
    }
}