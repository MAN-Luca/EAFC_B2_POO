package miniProjet;

import java.util.Scanner;

public class Main
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String cheminFichier = "parcAuto.txt";
		
		System.out.println("=========================================================");
		System.out.println("============== Gestion d'un parc automobile =============");
		System.out.println("=========================================================");
		System.out.println("\nLe contenu du fichier " + cheminFichier + "a été chargé !");
		
		ParcAutomobile parc = new ParcAutomobile();
		parc.chargerDepuisFichier(cheminFichier);

		Vehicule v;
		String x;
		while (true)
		{
			int choix = getUserInputMainMenu();
			
			switch (choix)
			{
				case 1:
					v = getUserInputVehicule();
					parc.ajouterVehicule(v);
					break;
				case 2:
					parc.afficherVehicules();
					break;
				case 3:
					System.out.print("Veuillez entrer le numéro d'immatriculation du véhicule a rechercher : ");
					x = input.nextLine();
					parc.rechercherVehicule(x);
					break;
				case 4:
					System.out.print("Veuillez entrer le numéro d'immatriculation du véhicule a supprimer : ");
					x = input.nextLine();
					parc.supprimerVehicule(x);
					break;
				case 5:
					double total = parc.calculerTotalKilometrage();
					System.out.println("kilométrage total du parc automobile : " + total + "km");
					break;
				case 6:
					parc.sauvegarderDansFichier("parcAuto.txt");
					break;
				case 7:
					System.out.println("Merci d'avoir utilisé le programme ! A bientôt :D");
					input.close();
					return;
			default:
				System.out.println("ERREUR ! VEUILLEZ ENTRER UN NOMBRE VALIDE");
				break;
			}
		}
	}

	public static int getUserInputMainMenu() 
	{
		System.out.println("\n===========================================================\n");
		System.out.println("1 : Ajouter un véhicule");
		System.out.println("2 : Afficher la liste des véhicules");
		System.out.println("3 : Rechercher un véhicule");
		System.out.println("4 : Supprimer un véhicule");
		System.out.println("5 : Afficher le kilométrage total des véhicules du parc");
		System.out.println("6 : Sauvegarder les véhicules dans un fichier");
		System.out.println("7 : Quitter le programme");
		
		System.out.print("Entrez le numéro correspondant >>> ");
		int choix = input.nextInt();
		input.nextLine();
		System.out.println("\n===========================================================\n");
		return choix;
	}
	
	public static Vehicule getUserInputVehicule() 
	{
	    // Demander le type de véhicule
	    System.out.println("Quel type de véhicule voulez-vous ajouter ?");
	    System.out.println("1 : Voiture");
	    System.out.println("2 : Camion");
	    System.out.print("Entrez le choix >>> ");
	    int typeChoix = input.nextInt();
	    input.nextLine(); // Consommer le \n restant après nextInt()
	    
	    // Demander les informations communes
	    System.out.print("Entrez le numéro d'immatriculation : ");
	    String immatriculation = input.nextLine();
	    
	    System.out.print("Entrez la marque : ");
	    String marque = input.nextLine();
	    
	    System.out.print("Entrez le modèle : ");
	    String modele = input.nextLine();
	    
	    System.out.print("Entrez l'année : ");
	    int annee = input.nextInt();
	    input.nextLine(); // Consommer le \n restant après nextInt()
	    
	    System.out.print("Entrez le kilométrage : ");
	    double kilometrage = input.nextDouble();
	    input.nextLine(); // Consommer le \n restant après nextDouble()
	    
	    Vehicule vehicule = null;
	    if (typeChoix == 1) 
	    {
	        // Si c'est une voiture, demander le nombre de places
	        System.out.print("Entrez le nombre de places : ");
	        int nPlaces = input.nextInt();
	        input.nextLine(); // Consommer le \n restant après nextInt()
	        vehicule = new Voiture(immatriculation, marque, modele, annee, kilometrage, nPlaces);
	    } 
	    else if (typeChoix == 2) 
	    {
	        // Si c'est un camion, demander la capacité de chargement
	        System.out.print("Entrez la capacité de chargement : ");
	        double capacite = input.nextDouble();
	        input.nextLine(); // Consommer le \n restant après nextDouble()
	        vehicule = new Camion(immatriculation, marque, modele, annee, kilometrage, capacite);
	    } 
	    else 
	    {
	        System.out.println("Choix invalide !");
	    }
	    
	    return vehicule;
	}
	
}
