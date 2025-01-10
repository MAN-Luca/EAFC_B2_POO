package exam_bilan_1;
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

public class Ex1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int note;
        int c = 0;
        
        // Initialisation du tableau avec tous les élements à -1 
        int[] tab = new int[10];
        
        for (int i = 0; i < tab.length; i++)   /* OU alors Arrays.fill(tab, -1) */
			tab[i] = -1;
        
        // Lire les notes en saisie
        do 
        {
            System.out.println("Entrez une note (ou un nombre négatif pour stoper la saisie) : ");
            note = input.nextInt();
            tab[c] = note;
            c++;
        } while (tab.length <= 10 && note > 0);
        
        // Calculer la moyenne
        int som = 0;
        int nb_notes = 0;
        for (int x : tab)
        {
			if (x != -1)
			{
				som += x;
				nb_notes++;
			}
        }
        double moy = (double) som / (double) nb_notes;
        
        // Afficher note supérieures ou égales à la moyenne
        String notes_sup_moy = "";
        for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] >= moy)
			{
				notes_sup_moy += tab[i] + " ";
			}
		}
        // Afficher réussi ou raté
        String resultat = moy >= 10 ? "réussi" : "échoué";
        
        // Recherche d'une valeur
        System.out.println("Veuillez entrer une note à rechercher : ");
        int recherche = input.nextInt();
        int indice = 0;
        boolean res_recherche = false;
        
        for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] == recherche)
			{
				res_recherche = true;
				indice = i;
				break;
			}
		}
        // Afficher la note max et min
        int min = tab[0];
        int max = tab[0];
        for (int elem : tab)
		{
        	if (elem != -1)
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
		}
        
        
        
        System.out.println("La moyenne des notes : " + String.format("%.2f", moy) +"/20");
        System.out.println("Notes supérieures ou égales à la moyenne : " + notes_sup_moy);
        System.out.println("L'étudiant à " + resultat);
        if (res_recherche) 
        {
        	System.out.println("La note " + recherche + " se trouve dans le tableau à la position " + indice);
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

