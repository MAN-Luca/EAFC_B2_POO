package revisionEX6;

//Classe qui hérite de la classe Account et qui implémenta Transaction
public class CheckingAccount extends Account implements Transaction
{
	// Attribut spécifique à CheckingAccount
	private double overdraftLimit;
	
	// Constructeur de la classe
	public CheckingAccount(String accountNumber, double overdraftLimit) 
	{
		// Appel au constructeur de la classe mère en utilisant super()
        super(accountNumber);
        this.overdraftLimit = overdraftLimit; 
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
		// Si on retire moins que le solde + le montant à découvert disponible alors ça marche 
		if (amount <= this.balance + this.overdraftLimit)
		{
            this.balance -= amount; 
		}
        else	// SInon on lance une exception qui affiche un message d'erreur 
        {
            throw new IllegalArgumentException("Montant dépasse la limite de découvert."); 
        }
	}

    // Implémentation de la méthode abstraite 
    @Override
    public void calculerInteret() 
    {
        System.out.println("Pas d'intérêts sur un compte courant !");
    }
    
    // Implémentation de la méthode abstraite 
    public void fraisBancaires() 
    {
    	//	Si on est à découvert alors on retire 10 #
    	if (this.balance < 0) 
    	{
            this.balance -= 10; 
            System.out.println("Frais bancaires de découvert appliqués : 10€");
    	}
    }
}
