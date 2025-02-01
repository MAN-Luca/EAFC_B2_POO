package tp10.ex4;

public class Employe
{
	protected String nom;
	protected double salaire;
	
	public Employe(String nom, double salaire)
	{
		this.nom = nom;
		this.salaire = salaire;
	}
	
	public void afficherInfos()
	{
		System.out.println("Nom : " + this.nom + "\nSalaire : " + this.salaire);
		System.out.println("===============================");
	}
	
}
