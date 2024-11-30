package tp4;

import java.util.Arrays;

import mes_fonctions.MyFunc;

public class Ex1 {
	public static void main(String[] args) {
		int[] t = {1,2,3,4,5};
		for (int elem : t) {
			System.out.println(elem);
		}
		MyFunc.afficheMessage("Autre version");
		
		System.out.println(Arrays.toString(t));
	}


}
