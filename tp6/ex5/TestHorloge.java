package tp6.ex5;

public class TestHorloge
{

	public static void main(String[] args)
	{
		Horloge h = new Horloge(1, 40, 25);
		
		h.afficher_temps();
		
		h.ajouter_secondes(7854564);
		
		h.afficher_temps();
		
	}

}
