package miniProjet;

public abstract class Vehicule
{
	protected String numeroIM;
	protected String marque;
	protected String modele;
	protected int annee;
	protected double kilometrage;
	

	public Vehicule(String numeroIM, String marque, String modele, int annee, double kilometrage)
	{
		this.numeroIM = numeroIM;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.kilometrage = kilometrage;
	}

	public abstract void afficherDetails();
	
	// Ajoute des kilomètres au compteur (si la distance est positive)
	public void ajouterKM(double distance)
	{
		if (distance < 0)
		{
			System.out.println("ERREUR : IMPOSSIBLE D'AJOUTER UNE DISTANCE NEGATIVE");
			return;
		}
		String intercalaire = (distance != 1) ? "ont été ajoutés" : "a été ajouté";
		
		System.out.println(distance + "km " + intercalaire + "au compteur kilométrique");
		this.kilometrage += distance;
		System.out.println("Kilométrage actualisé : " + this.kilometrage + "km");
	}

	// Getters and Setters
	public String getNumeroIM() { return numeroIM; }
	public void setNumeroIM(String numeroIM) { this.numeroIM = numeroIM; }

	public String getMarque() { return marque; }
	public void setMarque(String marque) { this.marque = marque; }

	public String getModele() { return modele; }
	public void setModele(String modele) { this.modele = modele; }

	public int getAnnee() { return annee; }
	public void setAnnee(int annee) { this.annee = annee; }

	public double getKilometrage() { return kilometrage; }
	public void setKilometrage(double kilometrage) { this.kilometrage = kilometrage; }

}
