package exam_bilan_1;

import java.util.Scanner;

/*
1. Analyse de la chaine :  
                        - Demander à l'utilisateur de saisir une chaine de caractères
                        - Comptez le nombre de lettre majuscules et minuscules
                        - Vérifier si la chaine contient des chiffres
2. Transformation de la chaine :  
                        - Inversez la chaine de caractère et afficher le résultat
                        - Remplacer tous les espaces par des underscores et afficher le résultat
3. Extension - Vérification de palindrome: 
                        - Déterminer si la chaine de caractères est un palindrome
*/

public class Ex2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int c_min = 0;
		int c_max = 0;
		
		System.out.println("Veuillez entrer une chaine de caractères : ");
		String chaine = input.nextLine();
		char[] chaine_tab = chaine.toCharArray();
		// Compter le nombres de majuscules et de minuscules
		for (char c : chaine_tab)
		{
			if (Character.isUpperCase(c))
			{
				c_max++;
			}
			else if (Character.isLowerCase(c))
			{
				c_min++;
			}
		}
		// La chaine contient-elle des chiffres ?
		boolean has_digit = false;
		for (char c : chaine_tab)
		{
			if (Character.isDigit(c))
			{
				has_digit = true;
				break;
			}
		}
		String chiffre_str = has_digit ? "OUI" : "NON";
		
		// Inverser la chaine 
		String reverted_s = "";
		for (int i = chaine_tab.length - 1; i >= 0; i--)
		{
			reverted_s += chaine_tab[i];
		}
		// Remplacer les espaces par _
		String s_remplace = chaine.replace(" ", "_");
		
		// Vérifier si c'est un palindrome
		String intercalaire = (chaine.equals(reverted_s)) ? "est" : "n'est pas";
				
		
		System.out.println("Il y a " + c_min + " minuscules et " + c_max + " majuscules dans la chaine");
		System.out.println("La chaine contient des chiffres : " + chiffre_str);
		System.out.println("La chaine inversée est : " + reverted_s);
		System.out.println("Chaine modifiée : " + s_remplace);
		System.out.println("La chaine " + intercalaire + " un palindrome");
		
		input.close();
	}
}
