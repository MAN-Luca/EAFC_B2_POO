package tp3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		System.out.println("=".repeat(102));
		System.out.println("========== Bienvenue dans le programme qui affiche la table de multiplication d'un nombre n ==========");
		System.out.println("=".repeat(102));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();
		// Affiche de la table de multiplication
		for (int i = 0; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
