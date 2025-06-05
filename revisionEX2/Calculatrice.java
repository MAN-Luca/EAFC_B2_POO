package revisionEX2;

public class Calculatrice
{
	// Méthode d'addition de 2 entiers
	public int addition(int a, int b) 
	{
		return a+b;	// Retourne le résultat de a + b (int et int)
	}
	
	// Méthode d'addition de 3 entiers
	public int addition(int a, int b, int c) 
	{ 
		return a + b + c; // Retourne le resultat de a + b + c (int et int et int) 
    } 
	
	// Méthode d'addition de 2 doubles  
    public double addition(double a, double b) 
    { 
        return a + b; // Retourne le résultat de a + b (double et double)
    } 

    // Méthode de soustraction de 2 entiers
    public int soustraction(int a, int b) 
    { 
        return a - b; // Retourne le resultat de a - b	(int et int)
    } 
    
    // Méthode de multiplication de 2 entiers
    public int multiplication(int a, int b) 
    { 
        return a * b; // Retourne le résultat de a * b (int et int)
    } 

    // Méthode de multiplication 
    public double multiplication(int a, double b) 
    { 
    	return a * b; // Retourne le resultat de a * b (int et double)
    } 

    // Méthode de division de 2 entiers 
    public double division(int a, int b) 
    { 
    	// Vérification de la division par 0
        if (b == 0) // SI le dénominateur = 0 alors on affiche une erreur
        { 
            System.out.println("Erreur : division par zéro."); 
            return 0; // On retourne 0 pour indiquer l'erreur de division
        } 
        return (double) a / b; // Retourne le résultat de a / b sous forme de double (cast)
    } 
}
