package tp9.ex10;

public class MainSystemScolaire
{

	public static void main(String[] args) {

        Personne[] personnes = 
        {
            new Etudiant("Thomas", 1, "BLOC2"),
            new Etudiant("Luca", 2, "BLOC2"),
            new Professeur("H. Najdi", 3, 2800),
            new Professeur("Dr. Pr. Médiatheque Man", 4, 350_000)
        };


        for (Personne personne : personnes) 
        {
            personne.afficherRole();
            personne.afficherDetails();
            System.out.println(); // Ligne vide pour séparer les informations
        }
    }

}
