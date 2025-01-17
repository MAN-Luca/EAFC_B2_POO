package tp6.ex10;

public class TestLivreEmpruntable
{

	public static void main(String[] args)
	{
		LivreEmpruntable livre = new LivreEmpruntable("C++ Essentials V2");

        livre.afficherStatut(); 
        livre.emprunter();      
        livre.afficherStatut(); 
        livre.rendre();         
        livre.afficherStatut(); 
        livre.rendre();         
	}

}
