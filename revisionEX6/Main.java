package revisionEX6;

import java.util.Scanner;	// Import de la classe scanner

public class Main
{
	// Méthode main
	public static void main(String[] args)
	{
		// création de l'objet scanner
		Scanner scanner = new Scanner(System.in);
		
		// Demander le type de compte
        System.out.print("Enter account type (savings/checking): ");
        String type = scanner.nextLine();	// Lecture type compte

        Account account;

        // Si on veut un compte d'épargne
        if (type.equals("savings")) 
        {
        	// Créer un compte épargne avec taux d'intérêt
            System.out.print("Enter account number: ");
            String num = scanner.nextLine();	// Lecture numéro du compte
            System.out.print("Enter interest rate: ");
            double taux = scanner.nextDouble(); // Lecture taux d'intérêt
            account = new SavingsAccount(num, taux); // Création compte épargne

        } 
        // Si on veut un compte courant
        else if (type.equals("checking")) 
        {
            System.out.print("Enter account number: ");
            String num = scanner.nextLine();	// Lecture numéro du compte
            System.out.print("Enter overdraft limit: ");
            double overdraft = scanner.nextDouble(); // Lecture découvert
            account = new CheckingAccount(num, overdraft); // Création compte courant

        } 
        else // Si on a pas choisi le bon type
        {
            System.out.println("Invalid account type.");
            scanner.close();
            return;
        }

        // Dépôt
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        ((Transaction) account).deposit(depositAmount); // Cast pour appeler méthode interface

        // Retrait
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        try 
        {
            ((Transaction) account).withdraw(withdrawAmount); // Cast + try/catch
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Calcul intérêts et frais
        account.calculerInteret(); //  Calcul des intérêts
        account.fraisBancaires();  // Application des frais

        // Affichage final du solde
        account.displayBalance(); // Affichage du solde

        scanner.close();	// Fermetture de l'objet scanner
	}

}
