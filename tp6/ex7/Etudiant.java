package tp6.ex7;

import java.util.ArrayList;

public class Etudiant
{
    private String nom;
    private ArrayList<Double> notes; // Liste dynamique de notes
    
    // Constructeur modifié pour accepter une liste de notes
    public Etudiant(String n, ArrayList<Double> notes)
    {
        this.nom = n;
        this.notes = notes != null ? notes : new ArrayList<>(); // S'assurer que la liste des notes n'est pas null
    }
    
    public double moyenne()
    {
        double somme = 0;
        for (double note : this.notes)
        {
            somme += note; // Additionner toutes les notes
        }
        return somme / this.notes.size(); // Retourner la moyenne
    }
    
    public void afficheResulat()
    {
        String str = this.moyenne() >= 10 ? "Admis" : "Ajourné"; 
        System.out.println("Étudiant: " + this.nom);
        System.out.println("Notes: " + this.notes);
        System.out.println("\tMoyenne: " + this.moyenne());
        System.out.println("\tRésultat: " + str);
    }
    
}
