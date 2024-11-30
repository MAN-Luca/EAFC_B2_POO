package tp4;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[] t = {1,2,3,4,5,6,7,8,9};
		int res = 0;
		
		for (int elem : t) {res += elem;}
		
		System.out.println("La somme des éléments de " + Arrays.toString(t) + " = " + res);
	}

}
