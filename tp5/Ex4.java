package tp5;

import java.util.Scanner;
import mes_fonctions.MyFunc;

public class Ex4 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Compter les voyelles");

        Scanner input = new Scanner(System.in);
        String voyelles = "aàáâäãåeèéêëiîïoôöõuùúûüyÿAÀÁÂÄÃÅEÈÉÊËIÎÏOÔÖÕUÙÚÛÜYŸ";
        int compteur = 0;
        StringBuilder voyellesTrouvees = new StringBuilder();

        System.out.print("Veuillez entrer une chaine de caractères >>> ");
        String chaine = input.nextLine();
        for (char c : chaine.toCharArray()) {
            if (voyelles.indexOf(c) != -1) {
                compteur++;
                voyellesTrouvees.append(c);
            }
        }

        // Afficher le résultat
        if (compteur > 0) {
            System.out.println("La chaine contient " + compteur + " voyelle(s).");
            System.out.println("Voyelles trouvées : " + voyellesTrouvees);
        } else {
            System.out.println("Aucune voyelle(s) dans la chaine entrée.");
        }

        MyFunc.messageFin();
        input.close();
    }
}
