package tp3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int somme = 0;
		// Message de bienvenue
		System.out.println("=".repeat(103));
		System.out.println("========== Bienvenue dans le programme qui affiche les nombres multiples de 3 et 5 jusqu'a n ==========");
		System.out.println("=".repeat(103));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();
		
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				somme += i;
			}
		}
		System.out.println("La somme des nombres multiples de 3 et/ou 5 jusqu'à " + n + " = " + somme);
		
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
