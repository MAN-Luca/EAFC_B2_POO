package tp4;

import java.util.Arrays;

import mes_fonctions.MyFunc;

public class Ex5 {
/**
 * Tri à bulles = On vérifie si l'élément d'apres est plus petit que l'élement actuel. Si c'est le cas alors on les inverse, et ainsi
 * de suite. Les éléments les plus grands sont "poussés" vers la droite du tableau. Petit à petit le tableau devient trié.
 */
	public static void main(String[] args) {
		int[] t = {4,9,1,3,2,8,6,5,7};
		int n = t.length;
		int temp;		// Valeur temporaire pour échanger deux élements du tableau
		MyFunc.afficheMessage("Tri à Bulles");
		
		System.out.println("Tableau avant le tri : " + Arrays.toString(t));
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (t[j] > t[j + 1]) {
					temp = t[j];
					t[j] = t[j + 1];
					t[j + 1] = temp;
				}
			}
		}
		System.out.println("Tableau après le tri : " + Arrays.toString(t));
		
		MyFunc.messageFin();
	}

}
