package revisionEX6;

// Classe abstraite Account
public abstract class Account
{
	// Déclaration des attributs
	protected String accountNumber; 
    protected double balance; 

    // Constructeur de la classe
    public Account(String accountNumber) 
    { 
    	this.accountNumber = accountNumber; 
    	this.balance = 0;	// Le montant est initialisé à 0
    } 
    
    // Méthode concrète qui affiche le solde du compte
    public void displayBalance() 
    { 
    	System.out.println("Compte " + this.accountNumber + " : Solde = " + this.balance + "€");
    } 
    
    // Méthode abstraite qui affiche les intérêts
    public abstract void calculerInteret();
    
    // Méthode abstraite qui gère les frais bancaires
    public abstract void fraisBancaires();
}
