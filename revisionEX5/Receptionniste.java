package revisionEX5;

public class Receptionniste extends Utilisateur {

    // Constructeur
    public Receptionniste(String nom, String email) {
        super(nom, email); // Appel au constructeur parent
    }

    // Affichage du rôle
    @Override
    public void afficherRole() {
        System.out.println("Rôle : Réceptionniste");
    }

    // Marque une chambre comme indisponible
    public void marquerIndisponible(Chambre chambre) {
        chambre.setDisponible(false);
        System.out.println("Chambre marquée comme indisponible.");
    }
}
