package tp5;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyFunc.afficheMessage("Trouver une lettre");

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = input.nextLine();

        System.out.print("Entrez un caractère à rechercher : ");
        char caractere = input.next().charAt(0);

        int position = chaine.indexOf(caractere);

        if (position != -1) {
            System.out.println(
                    "Le caractère '" + caractere + "' est présent dans la chaîne à la position : " + (position + 1));
        } else {
            System.out.println("Le caractère '" + caractere + "' n'est pas présent dans la chaîne.");
        }

        MyFunc.messageFin();
        input.close();
    }
}
