package tp2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez entrer un chiffre entre 1 et 7\n>>> ");
		int jour = input.nextInt();
		switch (jour) {
		case 1:
			System.out.println("Lundi");
			break;
		case 2:
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("Jeudi");
			break;
		case 5:
			System.out.println("Vendredi");
			break;
		case 6:
			System.out.println("Samedi");
			break;
		case 7:
			System.out.println("Dimanche");
			break;
		default:
			System.out.println("Erreur, le nombre que vous avez donné n'est pas entre 1 et 7 !");
			break;
		}
		input.close();
	}

}
