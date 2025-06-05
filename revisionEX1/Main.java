package revisionEX1;

public class Main 
{
	// Méthode MAIN
	public static void main(String[] args) 
	{
		// Création de 2 objets employés
		Employe emp1 = new EmployeTempsPlein("Jean", 40, 3000);
		Employe emp2 = new EmployeTempsPartiel("Sophie", 28, 20, 80);
		
		// Affichage infos + salaires des employés
		emp1.afficherInformation();
		System.out.println("Salaire: " + emp1.calculeSalaire());
		
		emp2.afficherInformation();
		System.out.println("Salaire: " + emp2.calculeSalaire());
	}

}
