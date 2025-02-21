package miniProjet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ParcAutomobile implements GestionParc
{
	private ArrayList<Vehicule> listeVehicule;
	
	public ParcAutomobile()
	{
		this.listeVehicule = new ArrayList<>();
	}
	
	@Override
	public void ajouterVehicule(Vehicule v)
	{
		this.listeVehicule.add(v);
		System.out.println("Le véhicule : " + v.getNumeroIM() + " a été ajouté au parc automobile !");
	}

	@Override
	public void afficherVehicules()
	{
		for (Vehicule v : this.listeVehicule)
		{
			System.out.println("\n===========================================================\n");
			v.afficherDetails();
		}
	}

	@Override
	public Vehicule rechercherVehicule(String immatriculation)
	{
		for (Vehicule v : this.listeVehicule)
		{
			if (v.getNumeroIM().equals(immatriculation))
			{
				System.out.println("Le véhicule existe dans le parc automobile");
				v.afficherDetails();
				return v;
			}
		}
		System.out.println("Le véhicule n'existe pas dans le parc automobile");
		return null;
	}

	@Override
	public void supprimerVehicule(String immatriculation)
	{
		for (Vehicule v : this.listeVehicule)
		{
			if (v.getNumeroIM().equals(immatriculation))
			{
				this.listeVehicule.remove(v);
				System.out.println("Le véhicule " + immatriculation + " a été supprimé");
				return;
			}
		}
		System.out.println("Le véhicule " + immatriculation + " n'est pas dans le parc automobile");
	}

	@Override
	public double calculerTotalKilometrage()
	{
		double tot = 0;
		for (Vehicule v : this.listeVehicule)
		{
			tot += v.getKilometrage();
		}
		return tot;
	}

	@Override
	public void sauvegarderDansFichier(String fichier) 
	{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichier))) 
		{
			for (Vehicule v : this.listeVehicule) 
			{
		        StringBuilder sb = new StringBuilder();
		        sb.append(v.getClass().getSimpleName()).append(";");
		        sb.append(v.getNumeroIM()).append(";");
		        sb.append(v.getMarque()).append(";");
		        sb.append(v.getModele()).append(";");
		        sb.append(v.getAnnee()).append(";");
		        sb.append(v.getKilometrage());
		
		        // Ajout des informations spécifiques au type de véhicule
		        if (v instanceof Voiture) 
		        {
		            sb.append(";").append(((Voiture) v).getnPlaces());
		        } 
		        else if (v instanceof Camion) 
		        {
		            sb.append(";").append(((Camion) v).getCapaciteCharg());
		        }
		
		        writer.write(sb.toString());
		        writer.newLine();
			}
	    System.out.println("Parc automobile sauvegardé dans le fichier : " + fichier);
		} 
		catch (IOException e) 
		{
	        System.out.println("Erreur lors de la sauvegarde : " + e.getMessage());
	        e.printStackTrace();
			}
	}


	@Override
	public void chargerDepuisFichier(String fichier) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) 
	    {
	        String ligne;
	        while ((ligne = reader.readLine()) != null) 
	        {
	            String[] donnees = ligne.split(";");

	            // Vérifier le type de véhicule (première valeur)
	            String typeVehicule = donnees[0];
	            String numeroIM = donnees[1];
	            String marque = donnees[2];
	            String modele = donnees[3];
	            int annee = Integer.parseInt(donnees[4]);
	            double kilometrage = Double.parseDouble(donnees[5]);

	            // Créer le véhicule en fonction du type
	            Vehicule v = null;
	            if (typeVehicule.equals("Voiture")) 
	            {
	                int nPlaces = Integer.parseInt(donnees[6]);
	                v = new Voiture(numeroIM, marque, modele, annee, kilometrage, nPlaces);
	            } 
	            else if (typeVehicule.equals("Camion")) 
	            {
	                double capaciteCharg = Double.parseDouble(donnees[6]);
	                v = new Camion(numeroIM, marque, modele, annee, kilometrage, capaciteCharg);
	            }

	            // Ajouter le véhicule à la liste
	            if (v != null) 
	            {
	                this.listeVehicule.add(v);
	                System.out.println("Véhicule " + v.getNumeroIM() + " chargé depuis le fichier.");
	            }
	        }
	    } 
	    catch (IOException e) 
	    {
	        System.out.println("Erreur lors du chargement du fichier : " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	
}
