package revisionEX1;

// Classe qui hérite de la classe employé
public class EmployeTempsPlein extends Employe 
{
	// Attribut spécifique à la classe employé temps plein
	private double salaireMensuel;
	
	// Constructeur de la classe
	public EmployeTempsPlein(String nom, int age, double salaireMensuel) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
		super(nom, age);
		this.salaireMensuel = salaireMensuel;
	}
	
	// Implémentation de la méthode abstraite 
	@Override
	 public double calculeSalaire() 
	{
		return salaireMensuel; // Salaire fixe mensuel
	}
}
