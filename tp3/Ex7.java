package tp3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Déclarations
        Scanner input = new Scanner(System.in);
        String mot_de_passe;
        int nb_essais = 3;
        boolean est_trouve = false;
        
        // Message de bienvenue
        System.out.println("=".repeat(56));
        System.out.println("==== Bienvenue dans le programme d'authentification ====");
        System.out.println("=".repeat(56));
        // Vérification du mot de passe (rappel bon mdp ! 1324)
        do {
        	System.out.print("Vous avez 3 essais pour entrer votre mot de passe\nVeuillez entrer votre mot de passe >>> ");
			mot_de_passe = input.next();
			
			if (mot_de_passe.equals("1234")) {
				est_trouve = true;
			} else {
				nb_essais--;
				System.out.println("Raté ! Il vous reste " + nb_essais + " essais avant le blocage de votre compte");
			}
		} while (!est_trouve && nb_essais > 0);
        // Affichage du résultat
        if (est_trouve)
        	System.out.println("Mot de passe correct !");
        else
        	System.out.println("Votre compte est bloqué, veuillez réessayer dans 10 minutes !");
        
		// Message d'au revoir
		System.out.println("=".repeat(68));
		System.out.println("========== Merci d'avoir utilisé ce programme ! Au revoir ==========");
		System.out.println("=".repeat(68));
		// Clôture de l'objet scanner
		input.close();
	}

}
