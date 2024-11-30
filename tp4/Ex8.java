package tp4;

import java.util.ArrayList;
import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] t = {1, 2, 3, 4, 5}; // Tableau d'exemple
        MyFunc.afficheMessage("Sous-tables");
        System.out.println("Veuillez entrer un nombre : ");
        int target = input.nextInt(); // C'est la valeur à laquelle on veut que la somme des sous-séquences soit égale

        ArrayList<ArrayList<Integer>> sousListes = new ArrayList<>(); // Liste qui va contenir toutes les sous-séquences valides

        // Parcours du tableau à partir de chaque élément
        for (int i = 0; i < t.length; i++) {
            int somme = 0; // Somme qui sera mise à jour pour chaque sous-séquence
            ArrayList<Integer> sousSequence = new ArrayList<>(); // Liste temporaire pour stocker la sous-séquence en cours

            // Cette boucle ajoute les éléments à la sous-séquence
            for (int j = i; j < t.length; j++) {
                sousSequence.add(t[j]); // Ajouter l'élément à la sous-séquence
                somme += t[j]; // Ajouter la valeur à la somme de la sous-séquence

                // Si la somme correspond à la valeur cible, on ajoute cette sous-séquence à la liste des résultats
                if (somme == target) {
                    sousListes.add(new ArrayList<>(sousSequence)); // Création d'une nouvelle liste pour éviter les références partagées
                }
            }
        }

        // Affichage des résultats
        if (sousListes.isEmpty()) {
            System.out.println("Aucune sous-séquence trouvée.");
        } else {
            System.out.println("Sous-séquences dont la somme est égale à " + target + " : ");
            for (ArrayList<Integer> sousListe : sousListes) {
                System.out.println(sousListe.toString());
            }
        }

        input.close();
        MyFunc.messageFin();
    }
}
