package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex6 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui affiche la table de multiplication d'un nombre n");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer le nombre n >>> ");
		// Affiche de la table de multiplication
		for (int i = 0; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
