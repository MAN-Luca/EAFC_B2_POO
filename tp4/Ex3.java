package tp4;

import java.util.Arrays;
import java.util.Scanner;

import mes_fonctions.MyFunc;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] t = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		boolean found = false;
		int milieu = 0;
		
		MyFunc.afficheMessage("Recherche d'un élement dans un tableau");
		
		System.out.print("Quel nombre voulez vous rechercher dans la liste ? : ");
		int target = input.nextInt();
		
		int debut = 0;
		int fin = t.length - 1;
		
		while (debut <= fin && !found) {
			milieu = (debut + fin) / 2;
			if (t[milieu] == target) {
				found = true;
			} else if (t[milieu] < target){
				debut = milieu + 1;
			} else {
				fin = milieu - 1;
			}
		}
		if (found) {
			System.out.println("Le nombre " + target + " est dans la liste à l'indice " + milieu);
		} else {
			System.out.println("Le nombre " + target + " n'est pas dans la liste");
		}
		System.out.println(Arrays.toString(t));
		MyFunc.messageFin();
		
		input.close();
	}
}
