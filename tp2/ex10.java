package tp2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double res;
		System.out.println("=============================================================================");
		System.out.println("=========== Bienvenue dans ce programme, convertisseur de monnaie ===========");
		System.out.println("=============================================================================");
		System.out.println("Veillez entrer une valeur en €\n>>> ");
		double x = input.nextDouble();
		
		System.out.println("Veillez entrer la devise pour faire la conversion\nChoisir entre 'USD', 'GBP' et 'JPY'>>> ");
		String devise = input.next();
		
		switch (devise.toUpperCase()) {
		case "USD":
			res = x * 1.05;
			System.out.println(x +"€ = $"+ res);
			break;
		case "GBP":
			res = x * 0.83;
			System.out.println(x +"€ = "+ res + " £");
			break;
		case "JPY":
			res = x * 163.77;
			System.out.println(x +"€ = "+ res + " ¥");
			break;
		default:
			System.out.println("Vous n'avez pas entré une devise valable");
			break;
		}
		System.out.println("=============================================================================");
		System.out.println("=========== Merci d'avoir utilisé ce programme ! Bonne journée :D ===========");
		System.out.println("=============================================================================");
		input.close();
	}

}
