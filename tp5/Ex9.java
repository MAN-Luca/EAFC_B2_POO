package tp5;

import mes_fonctions.MyFunc;

public class Ex9 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Concaténer un tableau de mots");

        String[] tab = { "Bonjour", "à", "tous", "les", "amis", "!", "J'adore", "coder", "en", "Java" };
        StringBuilder res = new StringBuilder();

        for (String mot : tab) {
            res.append(mot + " ");
        }
        System.out.println(res);

        MyFunc.messageFin();
    }
}
