package tp6.ex9;

import java.util.ArrayList;
import java.util.List;

public class Banque
{
	private String nomBanque;
	private List<String> clients;
	private int nb_clients = 0;
	
	public Banque(String nom)
	{
		this.nomBanque = nom;
		this.clients = new ArrayList<>();
	}
	
	public void ajouterClient(String client)
	{
		this.clients.add(client);
	}
	
	public void afficherClients()
	{
		System.out.println("Banque : " + this.nomBanque);
		for (String client : this.clients)
		{
			this.nb_clients++;
			System.out.println("Client n° " + this.nb_clients + ": " + client);
		}
	}
}
