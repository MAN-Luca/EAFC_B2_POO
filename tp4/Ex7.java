package tp4;

import java.util.Arrays;

import mes_fonctions.MyFunc;

public class Ex7 {

	public static void main(String[] args) {
		int[] t = {1,2,3,4};
		
		MyFunc.afficheMessage("Rotation gauche des éléments");
		System.out.println("Tableau avant rotation gauche : " + Arrays.toString(t));

		int n = MyFunc.getPositiveInput("Combien de \"rotation\" voulez vous faire dans le talbeau ? : ");

		for (int k = 0; k < n; k++){
			int temp = t[0];
			for (int i = 1; i < t.length; i++) {
				t[i - 1] = t[i];
			}
			t[t.length - 1] = temp;
		}
		System.out.println("Tableau après " + n + " rotation(s) gauche : " + Arrays.toString(t));
		MyFunc.messageFin();
	}

}
