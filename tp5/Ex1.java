package tp5;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		MyFunc.afficheMessage("Compter les caractères");
		System.out.print("Veuillez entrer une chaine de caractère >>> ");
		String x = input.nextLine();
		System.out.print("La chaine de caractères \"" + x + "\" contient " + x.trim().length() + " caractères");
		MyFunc.messageFin();

		input.close();
	}

}
