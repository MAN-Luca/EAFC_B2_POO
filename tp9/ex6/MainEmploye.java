package tp9.ex6;

public class MainEmploye
{

	public static void main(String[] args)
	{
		Employe e1 = new Employe("malu0702", "Luca Mansutti", 4300);
		
		e1.augmenteSalaire(80);
		System.out.println("Le nouveau salaire vaut " + e1.getSalaire() + " €");
	}

}
