package revisionEX7;

//Classe qui hérite de la classe Employee et qui implémenta Payable
public class FullTimeEmployee extends Employee implements Payable
{
	// Attribut spécifique a employé temps plein
	private double bonus;
	 
    // Constructeur de la classe
    public FullTimeEmployee(String name, String id, double baseSalary, double bonus) 
    {
        super(name, id); // Appel du constructeur de la classe mère
        this.baseSalary = baseSalary; 
        this.bonus = bonus; 
    }
    
    // Implémentation de la méthode abstraite
	@Override
    public double calculateSalary() 
    {
        return this.baseSalary + this.bonus; // Salaire total = salaire de base + bonus
    }
    
	// Implémentation de la méthode de l'interface
	@Override
	public double pay()
	{
		return this.calculateSalary();
	}


}
