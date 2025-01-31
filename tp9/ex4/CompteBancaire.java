package tp9.ex4;

public class CompteBancaire
{
	private String num_compte;
	private double solde;
	
	public CompteBancaire(String num_compte, double solde) 
	{
		this.num_compte = num_compte;
		this.solde = solde;
	}
	
	public void deposer(double montant)
	{
		if (montant < 0)
		{
			throw new IllegalArgumentException("Le montant à ajouter ne peut pas être négatif");
		}
		this.solde += montant;
		System.out.println("Le montant de " + montant + " a été ajouté du compte " + this.num_compte + " - Total : " + this.solde);

	}
	
	public void retirer(double montant)
	{
		if (montant > this.solde)
		{
			throw new IllegalArgumentException("Le montant à retirer ne peut pas supérieur au solde actuel");
		}
		this.solde -= montant;
		System.out.println("Le montant de " + montant + " a été retiré du compte " + this.num_compte + " - Total : " + this.solde);
	}

	public double getSolde()
	{
		return solde;
	}

	public String getNum_compte()
	{
		return num_compte;
	}
	
}
