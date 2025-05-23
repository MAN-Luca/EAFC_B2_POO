package revisionEX5;

class Reservation {
    private Client client;
    private Chambre chambre;
    private int nbNuits;

    public Reservation(Client client, Chambre chambre, int nbNuits) {
        this.client = client;
        this.chambre = chambre;
        this.nbNuits = nbNuits;
        chambre.setDisponible(false); // Marque la chambre comme réservée
    }

    public double calculerMontant() {
        return chambre.getPrixParNuit() * nbNuits;
    }

    public void afficherDetails() {
        System.out.println("Réservation pour client dans la chambre " + chambre.getNumero());
        System.out.println("Nombre de nuits : " + nbNuits);
        System.out.println("Montant total : " + calculerMontant() + " €");
    }
}
