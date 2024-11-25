package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex4 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui affiche les nombres (décroissant) de n à 0");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer le nombre n >>> ");
		int i = n;
		// Affichage des nombre d'une manière décroissante
		do {
			System.out.println(i);
			i--;
		} while (i >= 0);
		
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
