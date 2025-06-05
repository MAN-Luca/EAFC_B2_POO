package revisionEX2;

public class Main
{
	// Méthode MAIN
	public static void main(String[] args)
	{
		Calculatrice calc = new Calculatrice(); // Création d’un objet calculatrice

		// Test des différentes méthode pour l'addiction - Test de la surchage
        System.out.println("Addition (2, 3): " + calc.addition(2, 3)); 
        System.out.println("Addition (2, 3, 4): " + calc.addition(2, 3, 4)); 
        System.out.println("Addition (2.5, 3.5): " + calc.addition(2.5, 3.5)); 
        
        // Test des différentes méthode pour la multiplication - Test de la surchage
        System.out.println("Soustraction (10, 4): " + calc.soustraction(10, 4)); 
        System.out.println("Multiplication (3, 4): " + calc.multiplication(3, 4)); 
        System.out.println("Multiplication (3, 2.5): " + calc.multiplication(3, 2.5)); 
        
        // Test des différentes méthode pour la division - Test de la gestion de l'erreur de division par 0
        System.out.println("Division (10, 2): " + calc.division(10, 2)); 
        System.out.println("Division (10, 0): " + calc.division(10, 0)); 
	}
}
