package tp4;

import java.util.Arrays;

import mes_fonctions.MyFunc;

public class Ex4 {

	public static void main(String[] args) {
		int[] t = {1,2,3,4,5,6,7,8,9};
		int n = t.length;
		int[] res = new int[n];
		MyFunc.afficheMessage("Inversion d'un tableau");
		
		for (int i = 0; i < n; i++) {
			res[i] = t[n - i - 1];
		}
		System.out.println("Inversion de " + Arrays.toString(t));
		System.out.println("Résultat = " + Arrays.toString(res));
	}

}
