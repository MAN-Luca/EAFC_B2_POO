package tp6.ex3;

import java.util.Scanner;

public class TestCompte {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le nom du titulaire du compte :");
		String nom = input.nextLine();
		System.out.println("Entrez le montant du compte (-1) si initialiser à 0 :");
		double solde = input.nextDouble();
		Compte c1;
		if (solde == -1)
			c1 = new Compte(nom);
		else
			c1 = new Compte(nom, solde); 
		
		c1.afficherSolde();
		c1.deposer(1000);
		c1.retirer(500);
		c1.afficherSolde();
		
		input.close();
	}

}
