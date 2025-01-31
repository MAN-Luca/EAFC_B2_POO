package tp9.ex2;

public class MainProduit
{

	public static void main(String[] args)
	{
		
		Produit p1 = new Produit("Pomme", 1, 10);
		Produit p2 = new Produit("Banane", 1.3, 7);
		
		System.out.println("Le prix total du stock du produit " + p1.getNom() + " vaut " + p1.prixTOT() + " €");
		p1.retirerProduit(20);
		p1.retirerProduit(8);
		System.out.println("Le prix total du stock du produit " + p1.getNom() + " vaut " + p1.prixTOT() + " €");
		
		System.out.println("Le prix total du stock du produit " + p2.getNom() + " vaut " + p2.prixTOT() + " €");
		p2.retirerProduit(20);
		p2.retirerProduit(1);
		System.out.println("Le prix total du stock du produit " + p2.getNom() + " vaut " + p2.prixTOT() + " €");
		
		
	}

}
