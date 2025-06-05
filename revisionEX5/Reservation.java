package revisionEX5;

class Reservation {
    private Client client;       // Client ayant réservé
    private Chambre chambre;     // Chambre réservée
    private int nbNuits;         // Nombre de nuits réservées

    // Constructeur
    public Reservation(Client client, Chambre chambre, int nbNuits) {
        this.client = client;
        this.chambre = chambre;
        this.nbNuits = nbNuits;
        chambre.setDisponible(false); // Marque la chambre comme réservée
    }

    // Calcule le montant total de la réservation
    public double calculerMontant() {
        return chambre.getPrixParNuit() * nbNuits;
    }

    // Affiche les détails de la réservation
    public void afficherDetails() {
        System.out.println("Réservation pour client dans la chambre " + chambre.getNumero());
        System.out.println("Nombre de nuits : " + nbNuits);
        System.out.println("Montant total : " + calculerMontant() + " €");
    }
}
