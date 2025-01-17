package tp6.ex8;

import java.util.Scanner;

public class TestPersonne
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez un nom: ");
		String nom = input.nextLine();
		System.out.println("Entrez l'age de " + nom + " :");
		int age = input.nextInt();
		
		Personne p = new Personne(nom, age);
		p.afficheDetails();
		
		input.close();
	}
}
