package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex8 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui affiche une pyramide de hauteur n");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer le nombre n >>> ");		
		
		// Construction de la pyramide
		for (int i = 0; i < n; i++) {
			System.out.print(" ".repeat(n - 1 - i));
			System.out.println("*".repeat(2 * i + 1));
		}
		
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
