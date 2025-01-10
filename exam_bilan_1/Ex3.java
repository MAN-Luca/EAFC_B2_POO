package exam_bilan_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1. Génération de données :  
                        - Demandez à l'utilisateur de spécifier la taille d'un tableau (max 20)
                        - Remplissez le tableau avec des valeurs aléatoires entre 1 et 100
2. Calculs et affichages :  
                        - Calculez et affichez la somme dse éléments de tableau
                        - Affichez tous les nombres pairs
						- Indiquez si tous les éléments sont supérieurs à 50
3. Extension - Tri des données : 
                        - Triez le tableau en ordre croissant et affichez le nouveau tableau
*/

public class Ex3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random R = new Random();
		int t;
		int x;
		// Initialisation du tableau
		do
		{
			System.out.println("Veuillez entrer la taille du tableau (MAX = 20) : ");
			t = input.nextInt();
		} while (t < 1 || t > 20);
		int[] tab = new int[t];
		// Générer des nombres aléatoires
		for (int i = 0; i < tab.length; i++)
		{
			x = R.nextInt(100) + 1;
			tab[i] = x;
		}
		// Somme des élements + afficher les pairs + supérieur 50
		int som = 0;
		String pairs = "";
		boolean sup_50 = true;
		for (int n : tab)
		{
			som += n;
			if (n % 2 == 0)
			{
				pairs += n + " ";
			}
			if (sup_50 && n < 50)
			{
				sup_50 = false;
			}
		}
		String intercalaire = sup_50 ? "OUI" : "NON";
		// Tri du tableau 
		System.out.println("Tableau : " + Arrays.toString(tab));
		for (int i = 0; i < tab.length; i++)
		{
			for (int j = 0; j < tab.length - 1 - i; j ++)
			{
				if (tab[j] > tab[j + 1])
				{
					int temp = tab[j + 1];
					tab[j + 1] = tab[j];
					tab[j] = temp;
				}
			}
		}
		
		System.out.println("Somme des éléments : " + som);
		System.out.println("Liste des éléments pairs : " + pairs);
		System.out.println("Le tableau contient uniquement des élements supérieurs à 50 : " + intercalaire);
		System.out.println("Tableau trié : " + Arrays.toString(tab));
		
		input.close();
	}
}
