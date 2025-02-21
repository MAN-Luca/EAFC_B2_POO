package miniProjet;

public interface GestionParc
{
	void ajouterVehicule(Vehicule v);
	void afficherVehicules();
	Vehicule rechercherVehicule(String immatriculation);
	void supprimerVehicule(String immatriculation);
	double calculerTotalKilometrage();
	void sauvegarderDansFichier(String fichier);
	void chargerDepuisFichier(String fichier);
}
