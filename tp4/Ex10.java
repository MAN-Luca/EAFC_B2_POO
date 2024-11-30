package tp4;

import mes_fonctions.MyFunc;

public class Ex10 {

    public static void main(String[] args) {
        int[] t = {1, 2, 2, 3, 3, 3, 3, 5}; // Tableau d'entrée
        boolean[] dejaCompte = new boolean[t.length]; // à l'initialisation d'un tableau de boolean tout est "false"
        MyFunc.afficheMessage("Tableau de fréquence");

        System.out.println("Fréquences des éléments :");

        for (int i = 0; i < t.length; i++) {
            // Vérifie si l'élément a déjà été compté
            if (!dejaCompte[i]) {
                int compteur = 1; // Compte l'élément lui-même

                // Parcourt le reste du tableau pour compter les occurrences
                for (int j = i + 1; j < t.length; j++) {
                    if (t[j] == t[i]) {
                        compteur++;
                        dejaCompte[j] = true; // Marque cet élément comme déjà compté - Pour ne pas le recompter la prochaine fois qu'on passe dessus
                    }
                }

                // Affiche l'élément et sa fréquence
                System.out.println(t[i] + " : " + compteur);
            }
        }
        MyFunc.messageFin();
    }
}
