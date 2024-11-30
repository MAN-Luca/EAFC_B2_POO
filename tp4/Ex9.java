package tp4;

import mes_fonctions.MyFunc;

public class Ex9 {

	public static void main(String[] args) {
		MyFunc.afficheMessage("Matrice en spirale");
		
		int[][] m = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int n = m.length;
		
		int haut = 0;      // Limite supérieure (commence à 0)
		int bas = n - 1;   // Limite inférieure (ligne du bas)
		int gauche = 0;    // Limite de gauche (colonne 0)
		int droite = n - 1; // Limite de droite (colonne max)

		// Tant qu'il reste des cases à parcourir
		while (haut <= bas && gauche <= droite) {
			for (int i = gauche; i <= droite; i++) {	// Parcourir la ligne du haut, de gauche à droite
				// Affiche les éléments de la ligne "haut"
				System.out.print(m[haut][i] + " ");
			}
			// On avance vers le bas car la ligne "haut" est traitée
			haut++;


			for (int i = haut; i <= bas; i++) {		// Parcourir la colonne droite, de haut en bas
				// Affiche les éléments de la colonne "droite"
				System.out.print(m[i][droite] + " ");
			}
			// On recule vers la gauche car la colonne "droite" est traitée
			droite--;

			// Parcourir la ligne du bas, de droite à gauche
			// (à condition qu'il reste des lignes à parcourir)
			if (haut <= bas) {
				for (int i = droite; i >= gauche; i--) {
					// Affiche les éléments de la ligne "bas"
					System.out.print(m[bas][i] + " ");
				}
				// On monte car la ligne "bas" est traitée
				bas--;
			}

			// Parcourir la colonne gauche, de bas en haut
			// (à condition qu'il reste des colonnes à parcourir)
			if (gauche <= droite) {
				for (int i = bas; i >= haut; i--) {
					// Affiche les éléments de la colonne "gauche"
					System.out.print(m[i][gauche] + " ");
				}
				// On avance vers la droite car la colonne "gauche" est traitée
				gauche++;
			}
		}

		// Affiche un message de fin
		MyFunc.messageFin();
	}
}
