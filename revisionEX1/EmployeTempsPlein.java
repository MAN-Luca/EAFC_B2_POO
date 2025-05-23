package revisionEX1;

public class EmployeTempsPlein extends Employe {
	private double salaireMensuel;
	
	public EmployeTempsPlein(String nom, int age, double salaireMensuel) {
		 super(nom, age);
		 this.salaireMensuel = salaireMensuel;
	}
	
	@Override
	 public double calculeSalaire() {
		return salaireMensuel; // Salaire fixe mensuel
	 }
}
