package tp2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=".repeat(70));
		System.out.println("Bienvenue dans ce programme qui calcule si un triangle est valide ");
		
		System.out.println("Veillez entrer le premier côté\n>>> ");
		double a = input.nextDouble();
		System.out.println("Veillez entrer le second côté\n>>> ");
		double b = input.nextDouble();
		System.out.println("Veillez entrer le troisième côté\n>>> ");
		double c = input.nextDouble();
		// Règles de maths sur la validité des triangles
		if ((a > 0 && b > 0 && c > 0) && ((a+b > c) || (a+c > b) || (b+c > a))) {
			System.out.println("Okay, le triangle est valide");
		} else {
			System.out.println("Le triangle n'est pas valide");
		}
		System.out.println("=".repeat(70));
		input.close();
	}

}
