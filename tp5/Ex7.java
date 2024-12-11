package tp5;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex7 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Vérifier un palindrome");
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer une chaine de caractères >>> ");
        String mot = input.nextLine();

        ///////////////////////////// Version avec StringBuilder et la méthode "Reverse"
        if (est_palindrome_facile(mot)) {
            System.out.println(mot + " est un palindrome");
        } else {
            System.out.println(mot + " n'est pas un palindrome");
        }

        ////////////////////////////// Version avec un tableau
        if (est_palindrome_autre(mot)) {
            System.out.println(mot + " est un palindrome");
        } else {
            System.out.println(mot + " n'est pas un palindrome");
        }

        MyFunc.messageFin();
        input.close();
    }

    static boolean est_palindrome_facile(String chaine) {
        StringBuilder new_chaine = new StringBuilder(chaine);
        return chaine.equals(new_chaine.reverse().toString());
    }

    static boolean est_palindrome_autre(String chaine) {
        for (int i = 0; i < chaine.length() / 2; i++) {
            if (chaine.charAt(i) != chaine.charAt(chaine.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
