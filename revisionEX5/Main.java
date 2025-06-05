package revisionEX5;

public class Main {

    public static void main(String[] args) {
        // Création d’une chambre (numéro, prix par nuit)
        Chambre chambre1 = new Chambre(101, 120);

        // Création d’un client
        Client client = new Client("Alice", "alice@mail.com", "1234");

        // Tentative de connexion
        if (client.seConnecter("alice@mail.com", "1234")) {
            try {
                // Réservation de la chambre pour 3 nuits
                Reservation reservation = client.reserver(chambre1, 3);
                reservation.afficherDetails(); // Affiche les détails de la réservation
            } catch (ChambreIndisponibleException e) {
                System.out.println("Erreur : chambre non disponible.");
            }
        } else {
            System.out.println("Échec de la connexion.");
        }
    }
}
