package tp3;
import mes_fonctions.*;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Déclarations
		Scanner input = new Scanner(System.in);
		int somme = 0;
		// Message de bienvenue
		MyFunc.afficheMessage("Bienvenue dans le programme qui affiche les nombres multiples de 3 et 5 jusqu'a n");
		
		// Lecture de l'entrée de l'utilisateur
		int n = MyFunc.getPositiveInput("Veuillez entrer un nombre :");
		
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				somme += i;
			}
		}
		System.out.println("La somme des nombres multiples de 3 et/ou 5 jusqu'à " + n + " = " + somme);
		
		// Message d'au revoir
		MyFunc.messageFin();
		// Clôture de l'objet scanner
		input.close();
	}

}
