package tp3;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		System.out.println("=".repeat(87));
		System.out.println("========== Bienvenue dans le programme qui affiche une pyramide de hauteur n ==========");
		System.out.println("=".repeat(87));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();		
		
		// Construction de la pyramide
		for (int i = 0; i < n; i++) {
			System.out.print(" ".repeat(n - 1 - i));
			System.out.println("*".repeat(2 * i + 1));
		}
		
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
