package revisionEX5;

public class Receptionniste extends Utilisateur {
    public Receptionniste(String nom, String email) {
        super(nom, email); // Appel au constructeur parent
    }

    @Override
    public void afficherRole() {
        System.out.println("Rôle : Réceptionniste");
    }

    public void marquerIndisponible(Chambre chambre) {
        chambre.setDisponible(false); // Marque la chambre comme indisponible
        System.out.println("Chambre marquée comme indisponible.");
    }
}
