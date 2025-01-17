package tp6.ex8;

public class Personne
{
	private String nom;
	private int age;
	
	public Personne(String nom, int age)
	{
		this.nom = nom;
		this.age = age;
	}
	
	public boolean est_majeur()
	{
		return this.age >= 18;
	}
	
	public void afficheDetails()
	{
		String intercalaire = this.est_majeur() ? " est majeur !" : " n'est pas majeur ! ";
		System.out.println(this.nom + intercalaire);

	}
}
