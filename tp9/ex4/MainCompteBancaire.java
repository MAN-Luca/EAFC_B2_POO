package tp9.ex4;

public class MainCompteBancaire
{

	public static void main(String[] args)
	{
		CompteBancaire c1 = new CompteBancaire("ABCDEF", 1000);
		
		//c1.deposer(-5);
		c1.deposer(1000);
		
		//c1.retirer(3000);
		c1.retirer(500);
		
		System.out.println("Le solde du compte " + c1.getNum_compte() + " : " + c1.getSolde() + " €");
	}

}
