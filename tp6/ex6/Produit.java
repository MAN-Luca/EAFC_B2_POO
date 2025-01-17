package tp6.ex6;

public class Produit
{
	private String nom;
	private double prixProduit;
	private int quantitéProduit;
	
	public Produit(String nom, double prixP, int quantity)
	{
		this.nom = nom;
		this.prixProduit = prixP;
		this.quantitéProduit = quantity;
	}

	public void achat(int nb)
	{
		if (this.quantitéProduit - nb < 0)
			System.out.println("ERREUR : STOCK INSUFFISANT");
		else 
		{
			this.quantitéProduit -= nb;
			System.out.println(nb + " articles achetés, nouvelle quantité dans le stock = " + this.quantitéProduit);
		}
	}
	
	public void setPrixProduit(double prixProduit)
	{
		this.prixProduit = prixProduit;
	}
	
	public void setQuantitéProduit(int quantitéProduit)
	{
		this.quantitéProduit = quantitéProduit;
	}

	public void affiche()
	{
		System.out.println("Produit : " + this.nom + "\n\tPrix = " + this.prixProduit + "\n\tQuantité en stock = " + this.quantitéProduit);
	}
	
}
