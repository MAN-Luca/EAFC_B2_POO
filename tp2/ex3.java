package TravauxDirigés2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez entrer votre note\n>>> ");
		int note = input.nextInt();
		if (note >= 90) {
			System.out.println("Excellent !");
		} else if (note < 90 && note >= 70) {
			System.out.println("Bien");
		} else {
			System.out.println("Besoin d'amélioration");
		}
		input.close();
	}

}
