package revisionEX6;

//Classe qui hérite de la classe Account et qui implémenta Transaction
public class SavingsAccount extends Account implements Transaction
{
	// Attribut spécifique à SavingsAccount
	private double interestRate;
	
	// Constructeur de la classe
	public SavingsAccount(String accountNumber, double interestRate) 
	{ 
		// Appel au constructeur de la classe mère en utilisant super()
        super(accountNumber); 
        this.interestRate = interestRate;
    } 
	
	
	// Implémentation de la méthode deposit de l'interface
	@Override
	public void deposit(double amount) 
	{
		// Si le montant est positif alors c'est bon on l'ajoute
		if (amount > 0)
		{
			this.balance += amount;
		}
		else // Sinon on affiche un message d'erreur
		{
			System.out.println("ERREUR : Montant négatif !");
		}
	}
	
	// Implémentation de la méthode withdraw de l'interface avec une exception en cas d'erreur
	@Override
    public void withdraw(double amount) 
    {
    	// Si on retire moins que le solde disponible alors ça marche 
        if (amount <= this.balance)
        {
            this.balance -= amount;
        }
        else // SInon on lance une exception qui affiche un message d'erreur
        {
            throw new IllegalArgumentException("Fonds insuffisants"); 
        }
    }
	
    // Implémentation de la méthode abstraite 
    @Override
    public void calculerInteret() 
    {
        this.balance += this.balance * (this.interestRate / 100); // Ajoute les intérets au solde
    }
    
    // Implémentation de la méthode abstraite 
    public void fraisBancaires() 
    {
    	// On retire 1€ pour les frais bancaires
        System.out.println("Frais pour compte = 1€");
        this.balance--;
    }
    
}
