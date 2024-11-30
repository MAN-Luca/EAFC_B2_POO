package tp4;

import java.util.ArrayList;
import java.util.Arrays;

import mes_fonctions.MyFunc;

public class Ex6 {

	public static void main(String[] args) {
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,10,1,3,5,7,9};
		ArrayList<Integer> res = new ArrayList<>();
		
		MyFunc.afficheMessage("Fusion de deux tableaux");
		
		for (int elem : a) { 
			if (!res.contains(elem)) {
				res.add(elem);
			}
		}
		for (int elem : b) {
			if (!res.contains(elem)) {
				res.add(elem);
			}
		}
		System.out.println("Fusion des tableaux " + Arrays.toString(a) + " et " + Arrays.toString(b));
		System.out.println("Résulat = " + MyFunc.tri_bulle_arraylist(res).toString());  // On peut directement faire toString sur les arraylists
		
		MyFunc.messageFin();
	}

}
