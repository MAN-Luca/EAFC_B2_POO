package revisionEX7;

import java.util.Scanner; // Import de la classe Scanner

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // Création de l'objet scanner pour la saisie utilisateur

        // Demander le type d’employé (temps plein ou temps partiel)
        System.out.print("Enter employee type (fulltime/parttime): ");
        String type = scanner.nextLine(); // Lecture du type d'employé

        Employee emp; // Déclaration d'une variable de type Employee (classe abstraite)

        // Si l'utilisateur a choisi un employé à temps plein
        if (type.equalsIgnoreCase("fulltime")) 
        {
            // Demander le nom de l'employé
            System.out.print("Enter name: ");
            String name = scanner.nextLine(); // Lecture du nom

            // Demander l'identifiant
            System.out.print("Enter ID: ");
            String id = scanner.nextLine(); // Lecture de l'ID

            // Demander le salaire de base
            System.out.print("Enter base salary: ");
            double baseSalary = scanner.nextDouble(); // Lecture du salaire de base

            // Demander le bonus
            System.out.print("Enter bonus: ");
            double bonus = scanner.nextDouble(); // Lecture du bonus

            scanner.nextLine(); // Consommer le retour à la ligne laissé par nextDouble

            // Création de l'objet FullTimeEmployee avec les données saisies
            emp = new FullTimeEmployee(name, id, baseSalary, bonus);
        } 
        // Si l'utilisateur a choisi un employé à temps partiel
        else if (type.equalsIgnoreCase("parttime")) 
        {
            // Demander le nom de l'employé
            System.out.print("Enter name: ");
            String name = scanner.nextLine(); // Lecture du nom

            // Demander l'identifiant
            System.out.print("Enter ID: ");
            String id = scanner.nextLine(); // Lecture de l'ID

            // Demander le nombre d'heures travaillées
            System.out.print("Enter hours worked: ");
            int hoursWorked = scanner.nextInt(); // Lecture des heures travaillées

            // Demander le taux horaire
            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble(); // Lecture du taux horaire

            scanner.nextLine(); // Consommer le retour à la ligne laissé par nextDouble

            // Création de l'objet PartTimeEmployee avec les données saisies
            emp = new PartTimeEmployee(name, id, hoursWorked, hourlyRate);
        } 
        else // Si l'utilisateur a saisi un type invalide
        {
            System.out.println("Invalid employee type."); // Affichage d'un message d'erreur
            scanner.close(); // Fermeture du scanner
            return; // Fin du programme
        }

        // Afficher les informations de l'employé (nom, ID, salaire total)
        emp.displayInfo(); // Appel de la méthode pour afficher les informations

        // Afficher le paiement total en utilisant l'interface Payable (cast nécessaire)
        System.out.println("Total payment: " + ((Payable) emp).pay()); // Affichage du montant à payer

        scanner.close(); // Fermeture du scanner
	}
}
