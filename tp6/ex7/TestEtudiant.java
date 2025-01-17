package tp6.ex7;

import java.util.ArrayList;
import java.util.List;

public class TestEtudiant
{
    public static void main(String[] args)
    {
        // Créer des listes de notes en une seule ligne
        ArrayList<Double> notesAlice = new ArrayList<>(List.of(12.5, 14.0));
        ArrayList<Double> notesBob = new ArrayList<>(List.of(8.0, 6.5));
        
        // Créer des étudiants avec leurs listes de notes
        Etudiant etudiant1 = new Etudiant("Alice", notesAlice);
        Etudiant etudiant2 = new Etudiant("Bob", notesBob);
        
        // Afficher les résultats
        etudiant1.afficheResulat();

        etudiant2.afficheResulat();

    }
}
