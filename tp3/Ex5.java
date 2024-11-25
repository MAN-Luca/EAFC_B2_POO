package tp3;

import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex5 {

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
        	// chaine.charAt(i) = donne la lettre correspondante
        	// String.valueOf = converti chaine.charAt(i) en String pour utiliser la méthode contains qui est spécifique aux strings
        	// voyelles.contains(String.valueOf(chaine.charAt(i))) = True si voyelles contient le caractère sinon False
            if (voyelles.contains(String.valueOf(chaine.charAt(i)))) {
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
