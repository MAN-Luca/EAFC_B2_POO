package tp10.ex4;

public class MainEmploye
{
	public static void main(String[] args)
	{
		Employe e = new Employe("Jean", 2000);
		Manager m = new Manager("Luc", 2000, 500);
		
		e.afficherInfos();
		m.afficherInfos();
	}
}
