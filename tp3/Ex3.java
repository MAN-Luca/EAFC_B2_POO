package tp3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int i = 0;
		// Message de bienvenue
		System.out.println("=".repeat(89));
		System.out.println("========== Bienvenue dans le programme qui affiche les nombres pairs jusqu'a n ==========");
		System.out.println("=".repeat(89));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();
		// Affiche des nombre si ils sont pairs
		while (i < n+1) {
			if (i % 2 == 0) {System.out.println(i);}
			i++;
		}
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
