package TravauxDirigés2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre\n>>> ");
		double a = input.nextDouble();
		System.out.println("Veuillez entrer un nombre\n>>> ");
		double b = input.nextDouble();
		
		System.out.println("Veuillez entrer l'opération\nChoisir entre '+' '-' '*' '/'>>> ");
		String op = input.next();
		
		switch (op) {
		case "+":
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case "-":
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case "*":
			System.out.println(a + " x " + b + " = " + (a*b));
			break;
		case "/":
			System.out.println(a + " / " + b + " = " + (a/b));
			break;
		default:
			System.out.println("Erreur ! Opération non valide");
			break;
		}
		
		input.close();
	}

}
