package tp6.ex6;

public class TestProduit
{

	public static void main(String[] args)
	{
		
		Produit p = new Produit("AMD RADEON 7900xt", 799, 2);
		p.affiche();
		p.achat(5);
		p.setQuantitéProduit(10);
		p.achat(5);
		p.setPrixProduit(750);
		p.affiche();
		
	}

}
