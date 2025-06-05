package revisionEX6;

// Interface transaction
public interface Transaction
{
	// Méthodes de l'interface à implémenter 
	void deposit(double amount);	// Méthode pour deposer de l'argent
	void withdraw(double amount);	// Méthode pour retirer de l'argent
}
