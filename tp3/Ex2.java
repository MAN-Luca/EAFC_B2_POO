package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex2 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int res = 0;
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui calcule la somme des n-ième premier nombres");
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer un nombre >>> ");
		// Calcul de la somme
		for (int i = 1; i < n + 1; i++) {
			res += i;
		}
		// Affichage du résultat
		System.out.println("Somme des " + n + " premiers nombre = " + res);
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
