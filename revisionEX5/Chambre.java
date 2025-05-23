package revisionEX5;

public class Chambre {
    private int numero;
    private boolean disponible;
    private double prixParNuit;

    // Correction : inversion des paramètres corrigée
    public Chambre(int numero, double prixParNuit) {
        this.numero = numero;
        this.prixParNuit = prixParNuit;
        this.disponible = true; // Par défaut, une chambre est disponible
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    public int getNumero() {
        return numero;
    }
}
