package tp2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double remise;
		
		System.out.println("Veuillez entrer le montant\n>>> ");
		double montant = input.nextDouble();
		
		if (montant >= 100) {
			remise = 0.10;
		} else if (montant >= 50 && montant < 100) {
			remise = 0.05;
		} else {
			remise = 0;
		}
		
		System.out.println("Le prix à payer est " + (montant - (montant * remise)));
		input.close();
	}

}
