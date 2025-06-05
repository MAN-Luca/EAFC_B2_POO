package revisionEX5;

public class Chambre {
    private int numero;               // Numéro de la chambre
    private boolean disponible;       // État de disponibilité de la chambre
    private double prixParNuit;       // Prix d’une nuit dans la chambre

    // Constructeur avec numéro et prix
    public Chambre(int numero, double prixParNuit) {
        this.numero = numero;
        this.prixParNuit = prixParNuit;
        this.disponible = true; // Par défaut, une chambre est disponible
    }

    // Vérifie si la chambre est disponible
    public boolean estDisponible() {
        return disponible;
    }

    // Modifie la disponibilité
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Retourne le prix par nuit
    public double getPrixParNuit() {
        return prixParNuit;
    }

    // Retourne le numéro de la chambre
    public int getNumero() {
        return numero;
    }
}
