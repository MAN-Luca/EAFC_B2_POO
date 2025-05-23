package revisionEX1;

public class Main {

	public static void main(String[] args) {
		Employe emp1 = new EmployeTempsPlein("Jean", 40, 3000);
		Employe emp2 = new EmployeTempsPartiel("Sophie", 28, 20, 80);
		
		emp1.afficherInformation();
		System.out.println("Salaire: " + emp1.calculeSalaire());
		
		emp2.afficherInformation();
		System.out.println("Salaire: " + emp2.calculeSalaire());
	}

}
