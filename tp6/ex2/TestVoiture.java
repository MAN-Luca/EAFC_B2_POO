package tp6.ex2;

import java.util.Scanner;

public class TestVoiture {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez la marque :");
		String marque = input.nextLine();
		System.out.println("Entrez la modele :");
		String modele = input.nextLine();
		
		Voiture v = new Voiture(marque, modele);
		v.add_vitesse(30);
		v.afficher();
		v.add_vitesse(20);
		v.afficher();
		v.freiner(25);
		v.afficher();
		
		input.close();
	}

}
