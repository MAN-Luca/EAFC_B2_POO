package tp3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int res = 0;
		// Message de bienvenue
		System.out.println("=".repeat(97));
		System.out.println("========== Bienvenue dans le programme qui calcule la somme des n-ième premier nombres ==========");
		System.out.println("=".repeat(97));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer le nombre n >>> ");
		int n = input.nextInt();
		// Calcul de la somme
		for (int i = 1; i < n + 1; i++) {
			res += i;
		}
		// Affichage du résultat
		System.out.println("Somme des " + n + " premiers nombre = " + res);
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
