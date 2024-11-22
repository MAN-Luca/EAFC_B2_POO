package tp3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		System.out.println("=".repeat(71));
		System.out.println("========== Bienvenue dans le programme qui inverse un nombre ==========");
		System.out.println("=".repeat(71));
		// Lecture de l'entrée de l'utilisateur
		System.out.print("Veuillez entrer un nombre >>> ");
		int n = input.nextInt();	
		
		String chaine = "" + n; // ou bien String.valueOf(n)
		String chaine_reverted = "";
		// Inverser la chaine 
		for (int i = chaine.length() - 1; i >= 0; i--) {
			chaine_reverted += chaine.charAt(i);
		}
		System.out.println(chaine + " inversé = " + chaine_reverted);
		/**
		 * Version one liner
		 * String chaine_reverted = new StringBuilder(String.valueOf(n)).reverse().toString();
		 */
		
		
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
