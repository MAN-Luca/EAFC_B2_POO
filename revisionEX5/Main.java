package revisionEX5;

public class Main {

	 public static void main(String[] args) {
	        // Correction : ordre des paramètres corrigé (numero, prix)
	        Chambre chambre1 = new Chambre(101, 120);

	        // Création d’un client
	        Client client = new Client("Alice", "alice@mail.com", "1234");

	        if (client.seConnecter("alice@mail.com", "1234")) {
	            try {
	                // Appel de la méthode reserver et affichage des détails
	                Reservation reservation = client.reserver(chambre1, 3);
	                reservation.afficherDetails();
	            } catch (ChambreIndisponibleException e) {
	                System.out.println("Erreur : chambre non disponible.");
	            }
	        } else {
	            System.out.println("Échec de la connexion.");
	        }
	    }

}
