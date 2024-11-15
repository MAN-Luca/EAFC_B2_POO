package TravauxDirigés2;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double impot;
		System.out.println("Veuillez entrer une valeur\n>>> ");
		double x = input.nextDouble();
		if (x <= 10000) {
			impot = 1;
		} else if (x > 10000 && x <= 30000){
			impot = 0.10;
		} else {
			impot = 0.20;
		}
		System.out.println("L'impot sur votre revenu de " + x + " vaut " + (x * impot));
		input.close();
	}

}
