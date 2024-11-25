package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex3 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int i = 0;
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui affiche les nombres pairs jusqu'a n");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer un nombre >>> ");
		// Affiche des nombre si ils sont pairs
		while (i < n+1) {
			if (i % 2 == 0) {System.out.println(i);}
			i++;
		}
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
