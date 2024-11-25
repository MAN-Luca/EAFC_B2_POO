package mes_fonctions;

import java.util.Scanner;


public class MyFunc {
	
	public static void afficheMessage(String message) {
        System.out.println("=".repeat(message.length() + 12));  // Affiche une ligne de séparation
        System.out.println("===== " + message + " =====");    // Affiche le message encadré
        System.out.println("=".repeat(message.length() + 12) + "\n");  // Affiche une ligne de séparation
    }

	public static void messageFin() {
		System.out.println("\n" + "=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
	}
	
 	public static int getPositiveInput(String phrase) {
        Scanner input = new Scanner(System.in);
        int test = -1;  // Initialisation de test à une valeur invalide


        // La boucle continue jusqu'à ce que l'utilisateur entre un nombre positif
        do {
            // Affiche une fois la phrase d'invite
            System.out.print(phrase);
            if (input.hasNextInt()) {
                test = input.nextInt();  // Lit l'entrée si elle est un entier
                if (test <= 0) {
                    System.out.println("Erreur ! Veuillez entrer un nombre supérieur à 0 !");
                }
            } else {
                System.out.println("Erreur ! Ce n'est pas un nombre !");
                input.next();  // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        } while (test <= 0);  // La boucle continue tant que test est inférieur ou égal à 0

        input.close();
        return test;  // Retourne la valeur valide
    }
}
