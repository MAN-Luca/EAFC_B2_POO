package revisionEX1;

public class EmployeTempsPartiel extends Employe {
	
	private double tauxHoraire;
	private int heuresTravaillees;
	
	public EmployeTempsPartiel(String nom, int age, double tauxHoraire, int heuresTravaillees) {
		super(nom, age);
		this.tauxHoraire = tauxHoraire;
		this.heuresTravaillees = heuresTravaillees;
	}
	
	@Override
	public double calculeSalaire() {
		return tauxHoraire * heuresTravaillees; // Salaire basé sur les heures travaillées
	}

}
