package revisionEX5;

public abstract class Utilisateur {
    protected String nom;    // Nom de l'utilisateur
    protected String email;  // Email de l'utilisateur

    // Constructeur
    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    // Méthode abstraite à implémenter par les sous-classes
    public abstract void afficherRole();

    // Affiche les infos de base de l'utilisateur
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Email: " + email);
    }
}
