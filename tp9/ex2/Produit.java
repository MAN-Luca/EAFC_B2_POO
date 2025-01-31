package tp9.ex2;

public class Produit
{
	private String nom;
	private double prix;
	private int nb_stock;
	
	public Produit(String nom, double prix, int nb_stock)
	{
		this.nom = nom;
		this.prix = prix;
		this.nb_stock = nb_stock;
	}
	
	public double prixTOT()
	{
		return this.prix * this.nb_stock;
	}
	
	public void retirerProduit(int Q)
	{
		if (this.nb_stock >= Q)
		{
			this.nb_stock -= Q;
			System.out.println(Q + " produits ont étés supprimés, Il reste " + this.nb_stock + " articles " + this.nom + " en stock");
		}
		else
		{
			System.out.println("Quantité insuffisante, vous ne pouvez pas supprimer " + Q + " articles : " + this.nom + " - Quantité: " + this.nb_stock);
		}
	}
	
	public void ajouterProduit(int Q)
	{
		this.nb_stock += Q;
		System.out.println(Q + " produits ont étés ajoutés, Il y a " + this.nb_stock + " articles " + this.nom + " en stock");
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public double getPrix()
	{
		return prix;
	}

	public void setPrix(double prix)
	{
		this.prix = prix;
	}

	public int getNb_stock()
	{
		return nb_stock;
	}

	public void setNb_stock(int nb_stock)
	{
		this.nb_stock = nb_stock;
	}
	
	
}
