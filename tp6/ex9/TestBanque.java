package tp6.ex9;

public class TestBanque
{

	public static void main(String[] args)
	{
		Banque b = new Banque("FORTIS");
		
		b.ajouterClient("Ushiya");
		b.ajouterClient("Thomas");
		b.ajouterClient("Araz");
		b.ajouterClient("Luca");
		
		b.afficherClients();

	}

}
