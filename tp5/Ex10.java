package tp5;

import java.util.Scanner;
import mes_fonctions.MyFunc;

public class Ex10 {
    public static void main(String[] args) {
        MyFunc.afficheMessage("Évaluation des performances");
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer un mot >>> ");
        String chaine = input.nextLine().trim();

        @SuppressWarnings("unused")
        String resString = "";
        StringBuilder resBuilder = new StringBuilder();

        //////////////////////////////////////////// String
        long start = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            resString += chaine;
        }
        long end = System.nanoTime();
        // Conversion en ms avec précision à 4 décimales
        double elapsedTimeString = (end - start) / 1_000_000.0;
        System.out
                .println("Temps écoulé en utilisant \"String\" : " + String.format("%.4f", elapsedTimeString) + " ms");

        //////////////////////////////////////////// StringBuilder
        start = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            resBuilder.append(chaine);
        }
        end = System.nanoTime();
        // Conversion en ms avec précision à 4 décimales
        double elapsedTimeBuilder = (end - start) / 1_000_000.0;
        System.out.println(
                "Temps écoulé en utilisant \"StringBuilder\" : " + String.format("%.4f", elapsedTimeBuilder) + " ms");

        MyFunc.messageFin();
        input.close();
    }
}
