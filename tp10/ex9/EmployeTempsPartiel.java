package tp10.ex9;

public class EmployeTempsPartiel extends Employe 
{
	
    private double tauxHoraire;
    private int heuresTravaillees;

    public EmployeTempsPartiel(double tauxHoraire, int heuresTravaillees) 
    {
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculerSalaire() 
    {
        return tauxHoraire * heuresTravaillees;
    }
}
