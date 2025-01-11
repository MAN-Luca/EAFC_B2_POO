package exam_bilan_1;
import java.util.ArrayList;
/*
    1. Saisie de données :  
                            - Demander à l'utilisateur de saisir les notes d'un étudiant (maximum 10)
                            - Si l'utilisateur entre une valeur négative ou si le tableau est empli, arrêtez la saisie
    2. Calculs et affichages :  
                            - Calculez et affichez la moyenne des notes
                            - Affichez toutes les notes supérieures ou égales à la moyenne
                            - Indiquez si l'étudiant à échoué (moyenne < 10)
    3. Extension - Recherche des valeurs : 
                            - Demandez à l'utilisateur de saisir une note à rechercher
                            - Indiquez si cette note existe dans le tableau, et si oui, affichez sa position (indice)
    4. Affichage final des statistiques :
                            - Affichez la note la plus élevée et la plus basse
*/
import java.util.Scanner;

public class Ex1_avec_arraylists
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int note;
   
        // Initialisation du tableau dynamique
        ArrayList<Integer> tab = new ArrayList<>(); 
        // Lire les notes en saisie
        do 
        {
            System.out.print("Entrez une note (ou un nombre négatif pour stoper la saisie) : ");
            note = input.nextInt();
            if (note >= 0)
            	tab.add(note);
        } while (tab.size() <= 10 && note >= 0);
        
        // Calculer la moyenne
        int som = 0;
        for (Integer x : tab)
		{
			som += x;
		}
        double moy = (double) som / (double) tab.size();
        
        // Afficher note supérieures ou égales à la moyenne
        String notes_sup_moy = "";
        for (Integer x : tab)
		{
			if (x >= moy)
			{
				notes_sup_moy += x + " ";
			}
		}
        // Afficher réussi ou raté
        String resultat = moy >= 10 ? "réussi" : "échoué";
        
        // Recherche d'une valeur
        System.out.print("Veuillez entrer une note à rechercher : ");
        int recherche = input.nextInt();
        int res_recherche = tab.indexOf(recherche);
        
        // Afficher la note max et min
        int min = tab.get(0);
        int max = tab.get(0);
        for (Integer elem : tab)
		{
			if (elem < min)
			{
				min = elem;
			}
			if (elem > max)
			{
				max = elem;
			}
		}
        
        System.out.println("Résultats --------------------------------------------------------------------------\n");
        System.out.println("Notes de l'étudiant : " + tab);
        System.out.println("La moyenne des notes : " + String.format("%.2f", moy) +"/20");
        System.out.println("Notes supérieures ou égales à la moyenne des notes : " + notes_sup_moy);
        System.out.println("L'étudiant à " + resultat);
        if (res_recherche != -1) 
        {
        	System.out.println("La note " + recherche + " se trouve dans le tableau à la position " + res_recherche);
        }
        else
        {
        	System.out.println("La note " + recherche + " ne se trouve pas dans le tableau ");
        }
        System.out.println("La meilleure note de l'étudiant est : " + max + "/20");
        System.out.println("La moins bonne note de l'étudiant est : " + min + "/20");
        
        input.close();
	}
}  

