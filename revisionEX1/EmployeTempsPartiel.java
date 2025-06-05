package revisionEX1;

//Classe qui hérite de la classe employé
public class EmployeTempsPartiel extends Employe 
{
	// Attributs spécifiques à la classe employé temps partiel
	private double tauxHoraire;
	private int heuresTravaillees;
	
	// Constructeur de la classe
	public EmployeTempsPartiel(String nom, int age, double tauxHoraire, int heuresTravaillees) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom, age);
		this.tauxHoraire = tauxHoraire;
		this.heuresTravaillees = heuresTravaillees;
	}
	
	// Implémentation de la méthode abstraite 
	@Override
	public double calculeSalaire() 
	{
		return tauxHoraire * heuresTravaillees; // Calcul du salaire
	}

}
