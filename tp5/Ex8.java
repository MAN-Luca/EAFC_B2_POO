package tp5;

import java.util.Scanner;
import mes_fonctions.MyFunc;

public class Ex8 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Compresser une chaine");
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer une chaine de caractères >>> ");
        String chaine = input.nextLine().trim();

        int compteur = 1;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < chaine.length() - 1; i++) {
            if (chaine.charAt(i) == chaine.charAt(i + 1)) {
                compteur++;
            } else {
                res.append(chaine.charAt(i)).append(compteur);
                compteur = 1;
            }
        }
        // Ajoute le dernier caractère et son compteur
        res.append(chaine.charAt(chaine.length() - 1)).append(compteur);

        System.out.println("Chaine entrée : " + chaine);
        System.out.println("Chaîne compressée : " + res.toString());
        
        MyFunc.messageFin();
        input.close();
    }
}
