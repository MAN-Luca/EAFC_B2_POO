package tp10.ex4;

public class Manager extends Employe
{
	private double prime;
	
	public Manager(String nom, double salaire, double prime)
	{
		super(nom, salaire);
		this.prime = prime;
	}
	
	@Override
	public void afficherInfos()
	{
		System.out.println("Nom : " + this.nom + "\nPrime : " + this.prime + "\nSalaire : " + (this.salaire + this.prime));
		System.out.println("===============================");
	}
}
