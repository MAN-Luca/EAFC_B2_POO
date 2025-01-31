package tp9.ex1;

public class MainPersonne
{

	public static void main(String[] args)
	{
		Personne luca = new Personne("Lucas", 23);
		Personne thomas = new Personne("Thomas", 35);
		
		luca.afficherDetail();
		thomas.afficherDetail();
		
		luca.setNom("Luca");
		thomas.setAge(25);
		
		luca.afficherDetail();
		thomas.afficherDetail();
		
		System.out.println(luca.getAge());
	}

}
