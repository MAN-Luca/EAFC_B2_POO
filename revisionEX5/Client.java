package revisionEX5;

public class Client extends Utilisateur implements Authentifiable {

	private String motDePasse;
	
	public Client(String nom, String email, String motDePasse) {
		super(nom, email);
		this.motDePasse = motDePasse;
	}

	@Override
	public boolean seConnecter(String email, String motDePasse) {
		return this.email.equals(email) && this.motDePasse.equals(motDePasse);
	}
	
	
	@Override
	public void afficherRole() {
		System.out.println("Rôle : Client");
	}
	
	public Reservation reserver(Chambre chambre, int nbNuits) throws ChambreIndisponibleException {
        if (!chambre.estDisponible()) {
            // Lève une exception si la chambre n'est pas disponible
            throw new ChambreIndisponibleException("La chambre n'est pas disponible.");
        }
        chambre.setDisponible(false); // Marque la chambre comme réservée
        return new Reservation(this, chambre, nbNuits); // Retourne une nouvelle réservation
    }

	

}
