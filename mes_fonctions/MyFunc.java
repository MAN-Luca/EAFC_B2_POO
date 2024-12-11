package mes_fonctions;

import java.util.ArrayList;
import java.util.Scanner;

public class MyFunc {

    public static void afficheMessage(String message) {
        int totalLength = 68; // Longueur totale de la ligne de séparation
        // droite)
        String paddedMessage = "===== " + message + " =====";

        // Calculer la longueur de la partie "="
        int remainingLength = totalLength - paddedMessage.length();

        // Calculer combien de "=" à gauche et à droite du message
        String leftPadding = "=".repeat(remainingLength / 2);
        String rightPadding = "=".repeat(remainingLength - leftPadding.length());

        // Afficher la ligne de séparation avant et après le message
        System.out.println("=".repeat(68)); // Ligne de séparation
        System.out.println(leftPadding + paddedMessage + rightPadding);
        System.out.println("=".repeat(68) + "\n"); // Ligne de séparation

    }

    public static void messageFin() {
        System.out.println("\n" + "=".repeat(68)); // Ligne de séparation
        System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
        System.out.println("=".repeat(68)); // Ligne de séparation
    }

    public static int getPositiveInput(String phrase) {
        Scanner input = new Scanner(System.in);
        int test = -1; // Initialisation de test à une valeur invalide

        // La boucle continue jusqu'à ce que l'utilisateur entre un nombre positif
        do {
            // Affiche une fois la phrase d'invite
            System.out.print(phrase);
            if (input.hasNextInt()) {
                test = input.nextInt(); // Lit l'entrée si elle est un entier
                if (test <= 0) {
                    System.out.println("Erreur ! Veuillez entrer un nombre supérieur à 0 !");
                }
            } else {
                System.out.println("Erreur ! Ce n'est pas un nombre !");
                input.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        } while (test <= 0); // La boucle continue tant que test est inférieur ou égal à 0

        input.close();
        return test; // Retourne la valeur valide
    }

    public static int[] tri_bulle_tableau(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;
    }

    public static ArrayList<Integer> tri_bulle_arraylist(ArrayList<Integer> liste) {
        // Tri à bulles sur ArrayList
        for (int i = 0; i < liste.size() - 1; i++) {
            for (int j = 0; j < liste.size() - i - 1; j++) {
                // Comparer les éléments adjacents
                if (liste.get(j) > liste.get(j + 1)) {
                    // Échanger les éléments
                    int temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
        return liste;
    }

}
