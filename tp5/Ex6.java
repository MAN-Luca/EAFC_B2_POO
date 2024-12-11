package tp5;

import java.util.Scanner;
import mes_fonctions.MyFunc;

public class Ex6 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Remplacer les caractères");

        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer une chaine de caractères >>> ");
        String chaine = input.nextLine().trim();

        System.out.print("Quel caractère voulez vous remplacer? >>> ");
        char ancien = input.nextLine().charAt(0);

        System.out.print("Par quel autre caractère voulez vous remplacer l'ancien? >>> ");
        char nouveau = input.nextLine().charAt(0);

        System.out.println("L'ancienne chaine était : \'" + chaine + "\'");
        System.out.println("La nouvelle chaine est : \'" + chaine.replace(ancien, nouveau) + "\'");
        System.out.println("La nouvelle chaine est : \'" + remplaceAutre(ancien, nouveau, chaine) + "\'");

        MyFunc.messageFin();
        input.close();
    }

    static StringBuilder remplaceAutre(char aRemplacer, char remplacement, String chaine) {
        StringBuilder new_chaine = new StringBuilder(chaine);

        for (int i = 0; i < new_chaine.length(); i++) {
            if (new_chaine.charAt(i) == aRemplacer) {
                new_chaine.setCharAt(i, remplacement);
            }
        }
        return new_chaine;
    }
}
