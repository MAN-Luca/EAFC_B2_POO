package revisionEX7;

//Classe qui hérite de la classe Employee et qui implémenta Payable
public class PartTimeEmployee extends Employee implements Payable
{
	// Attributs spécifiques a employé partiel
	private int hoursWorked; 
	private double hourlyRate; 
	    
	// Constructeur de la classe
	public PartTimeEmployee(String name, String id, int hoursWorked, double hourlyRate)
	{
		super(name, id);
		this.hoursWorked = hoursWorked; 
	    this.hourlyRate = hourlyRate; 
	}
	
	// Implémentation de la méthode abstraite
	@Override
	public double calculateSalary()
	{
		return hoursWorked * hourlyRate; // Calcul du salaire basé sur les heures travaillées
	}
	
	// Implémentation de la méthode de l'interface
	@Override
	public double pay()
	{
		return this.calculateSalary();
	}



}
