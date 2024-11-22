package tp3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		System.out.println("=".repeat(96));
		System.out.println("========== Bienvenue dans le programme qui affiche les nombres (décroissant) de n à 0 ==========");
		System.out.println("=".repeat(96));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();
		int i = n;
		// Affichage des nombre d'une manière décroissante
		do {
			System.out.println(i);
			i--;
		} while (i >= 0);
		
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
