package tp5;

import java.util.Arrays;
import java.util.Scanner;
import mes_fonctions.MyFunc;

public class Ex5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MyFunc.afficheMessage("Vérifier un anagramme");

        System.out.print("Veuillez entrer une première chaine de caractères >>> ");
        String a = input.nextLine().toLowerCase();
        System.out.print("Veuillez entrer une seconde chaine de caractères >>> ");
        String b = input.nextLine().toLowerCase();

        if (est_anagramme(a.trim(), b.trim()))
            System.out.println("\"" + a + "\" et \"" + b + "\" sont des anagrammes.");
        else
            System.out.println("\"" + a + "\" et \"" + b + "\" ne sont pas des anagrammes.");

        MyFunc.messageFin();
        input.close();
    }

    static boolean est_anagramme(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] tabA = a.toCharArray();
        char[] tabB = b.toCharArray();

        Arrays.sort(tabA);
        Arrays.sort(tabB);

        return Arrays.equals(tabA, tabB);
    }
}
