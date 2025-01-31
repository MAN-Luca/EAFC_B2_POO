package tp9.ex1;

public class Personne
{
	private String nom;
	private int age;
	
	public Personne(String nom, int age)
	{
		this.nom = nom;
		this.age = age;
	}

	public void afficherDetail()
	{
		System.out.println("Nom : " + this.nom + ", âge : " + this.age);
	}
	
	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	
}
