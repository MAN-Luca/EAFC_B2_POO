package TravauxDirigés2;

import java.util.Random;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int target = random.nextInt(100) + 1;
		System.out.println("Veuillez entrer un nombre entre 1 et 100\n>>> ");
		int essai_utilisateur = input.nextInt();
		
		
		if (essai_utilisateur == target) {
			System.out.println("Bravo, vous avez trouvé le nombre !");
		} else if (essai_utilisateur < target) {
			System.out.println("Plus petit");
		} else {
			System.out.println("Plus haut");
		}
		
		input.close();
	}

}
