package revisionEX7;

// CLasse abstraite Employee
public abstract class Employee
{
	// Déclaration des attributs
	protected String name;
    protected String id;
    protected double baseSalary;
    
    // Constructeur de la classe 
    public Employee(String name, String id) { 
        this.name = name; 
        this.id = id; 
        this.baseSalary = 0.0;
    } 
    
    // Méthode abstraite pour calculer le salaire total
    public abstract double calculateSalary();
    
    // Afficher les informations de l’employé
    public void displayInfo() {
        // Affiche les informations de base de l'employé
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + calculateSalary());
    }
}
