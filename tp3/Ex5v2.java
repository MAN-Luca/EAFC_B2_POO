package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex5v2 {

    public static void main(String[] args) {
        // Déclarations
        Scanner input = new Scanner(System.in);
        String voyelles = "aàáâäãåeèéêëiîïoôöõuùúûüyÿAÀÁÂÄÃÅEÈÉÊËIÎÏOÔÖÕUÙÚÛÜYŸ";
        int compteur = 0;

        // Message de bienvenue
        MyFunc.afficheMessage("Programme pour compter les voyelles dans une chaîne de caractères");

        // Lecture de la chaîne
        System.out.print("Veuillez entrer une chaîne de caractères >>> ");
        String chaine = input.nextLine();

        // Compter les voyelles
        for (int i = 0; i < chaine.length(); i++) {
        	// indexOf retourne l'indice d'un char dans un String, si il n'est pas présent retourne -1
            if (voyelles.indexOf(chaine.charAt(i)) != -1) {
                compteur++;
            }
        }

        // Affichage du résultat
        System.out.println("La chaîne contient " + compteur + " voyelle(s).");

        // Message de fin
        MyFunc.messageFin();

        // Clôture de l'objet Scanner
        input.close();
    }
}
