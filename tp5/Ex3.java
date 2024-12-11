package tp5;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyFunc.afficheMessage("Convertir en majuscules et minuscules");

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = input.nextLine();

        System.out.println(chaine.toUpperCase());
        System.out.println(chaine.toLowerCase());

        MyFunc.messageFin();
        input.close();
    }
}
