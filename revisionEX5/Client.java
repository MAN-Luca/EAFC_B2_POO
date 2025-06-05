package revisionEX5;

public class Client extends Utilisateur implements Authentifiable {

    private String motDePasse; // Mot de passe du client

    // Constructeur
    public Client(String nom, String email, String motDePasse) {
        super(nom, email); // Appel au constructeur de Utilisateur
        this.motDePasse = motDePasse;
    }

    // Implémentation de la méthode d’authentification
    @Override
    public boolean seConnecter(String email, String motDePasse) {
        return this.email.equals(email) && this.motDePasse.equals(motDePasse); // Vérifie email et mot de passe
    }

    // Affichage du rôle
    @Override
    public void afficherRole() {
        System.out.println("Rôle : Client");
    }

    // Méthode pour réserver une chambre
    public Reservation reserver(Chambre chambre, int nbNuits) throws ChambreIndisponibleException {
        if (!chambre.estDisponible()) {
            // Lève une exception si la chambre n'est pas disponible
            throw new ChambreIndisponibleException("La chambre n'est pas disponible.");
        }
        chambre.setDisponible(false); // Marque la chambre comme réservée
        return new Reservation(this, chambre, nbNuits); // Retourne une nouvelle réservation
    }
}
