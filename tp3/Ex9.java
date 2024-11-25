package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex9 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui inverse un nombre");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer un nombre >>> ");
		
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
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
