package tp6.ex1;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Veuillez entrer la longueur du rectangle : ");
		double a = input.nextDouble();
		System.out.println("Veuillez entrer la largeur du rectangle : ");
		double b = input.nextDouble();
		
		Rectangle rect = new Rectangle(a, b);
		rect.affiche_infos();
		
		input.close();
	}

}
