package tp2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez un nombre \n>>> ");
		
		int x = input.nextInt();
		
		if (x % 2 == 0) {
			System.out.println(x + " est pair !");
		} else {
			System.out.println(x + " est impair !");
		}
		
		input.close();
	}
	
}
