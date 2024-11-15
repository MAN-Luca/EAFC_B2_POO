package TravauxDirigés2;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veillez entrer un premier nombre\n>>> ");
		double a = input.nextDouble();
		System.out.println("Veillez entrer un second nombre\n>>> ");
		double b = input.nextDouble();
		System.out.println("Veillez entrer un second nombre\n>>> ");
		double c = input.nextDouble();
		if ((a > 0 && b > 0 && c > 0) && ((a+b > c) || (a+c > b) || (b+c > a))) {
			System.out.println("Okay, le triangle est valide");
		} else {
			System.out.println("Le triangle n'est pas valide");
		}
		input.close();
	}

}
