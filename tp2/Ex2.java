package tp2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veillez entrer un premier nombre\n>>> ");
		double a = input.nextDouble();
		System.out.println("Veillez entrer un second nombre\n>>> ");
		double b = input.nextDouble();
		
		if (a > b) {
			System.out.println(a + " > " + b);
		} else if (a == b){
			System.out.println(a + " = " + b);
		} else {
			System.out.println(a + " < " + b);
		}
		input.close();
	}

}
