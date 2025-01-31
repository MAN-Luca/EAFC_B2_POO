package tp9.ex6;

public class Employe
{
	private String id;
	private String name;
	private double salaire;
	
	public Employe(String id, String name, double salaire)
	{
		this.id = id;
		this.name = name;
		this.salaire = salaire;
	}

	public void augmenteSalaire(double pourcentage)
	{
		this.salaire += this.salaire * pourcentage / 100;
	}
	
	public double getSalaire()
	{
		return salaire;
	}
	
	
	
}
