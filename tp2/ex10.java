package TravauxDirigés2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double res;
		
		System.out.println("Veillez entrer un une somme\n>>> ");
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
			System.out.println("Vous n'avez pas entrer une devise valable");
			break;
		}
		input.close();
	}

}
