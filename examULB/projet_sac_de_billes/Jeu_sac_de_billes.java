package examULB.projet_sac_de_billes;

import java.util.Scanner;

public class Jeu_sac_de_billes
{
	static Messages msg = new Messages(); 		
	static Scanner input = new Scanner(System.in);
	static final String OUI = "OUI";
	static final String NON = "NON";

	
	public static void main(String[] args)
	{
		int encore = 1;
	    while (encore != 0)
	    {
	        manche();  // Lance une manche du jeu
	        System.out.print(msg.entree_4);  // Affiche la demande de relance
	        encore = getInputWithRange(0, 1, msg.entree_4_1);
	    }
	    System.out.println(msg.message_10);
	    return;
	}
	
	public static void manche()
	{
		boolean tourJoueur = true;
		
		// Joue une manche de jeu
		System.out.println(msg.message_1);
		System.out.println(msg.message_2);
		System.out.println(msg.inter);
		System.out.print(msg.entree_2);
		int billesTOT = getBillesTOT();
		System.out.println(msg.inter);
		System.out.println(msg.message_3);

		while (billesTOT > 1)
		{
			if (tourJoueur)
			{
				System.out.println(String.format(msg.message_4, billesTOT));
				System.out.print(msg.entree_3);
				billesTOT -= getCoupJoueur();
				if (billesTOT != 1) 
				{
					System.out.println(String.format(msg.message_5, billesTOT));
				}
				System.out.println(msg.message_6);
			}
			else
			{
				int coupOrdi = getCoupOrdi(billesTOT);
				System.out.println(String.format(msg.message_7, coupOrdi));
				billesTOT -= coupOrdi;
			}
			tourJoueur = !tourJoueur;
		}
		
		if (tourJoueur)
		{
			System.out.println(msg.message_9);
		}
		else
		{
			System.out.println(msg.message_8);
		}
	}
	
	public static int getInputWithRange(int min, int max, String messageErreur)
	{
	    int x;
	    do 
	    {
	        x = input.nextInt();
	        if (x < min || x > max)
	            System.out.print(messageErreur);  // Affiche le message d'erreur
	    } while (x < min || x > max);
	    
	    return x;
	}

	public static int getBillesTOT()
	{
	    // Demande un nombre de billes entre 6 et 40
	    return getInputWithRange(6, 40, msg.entree_2_1);
	}

	public static int getCoupJoueur()
	{
	    // Demande un nombre de billes entre 1 et 4
	    return getInputWithRange(1, 4, msg.entree_3_1);
	}
	
	public static int getCoupOrdi(int billesTOT)
	{
		// Vérifier si billesTOT - 1 est un multiple de 5
		if ((billesTOT - 1) % 5 == 0)
		{
			// Si au moins 7 billes restantes, tirage aléatoire
			if (billesTOT >= 7)
			{
				int random_x = randomInt(1, 100);
				if (random_x <= 70)
					return 1;	// L'IA retire 1 bille
				else 
					return 2;	// L'IA retire 2 billes
			}
		}
		 // Si ce n'est pas le cas, l'IA cherche à mettre l'adversaire dans une situation où (billesTOT - i) % 5 == 0
		else 
		{
			for (int i = 1; i <= 4; i++)
			{
				if ((billesTOT - i - 1) % 5 == 0)
				{
					return i;	// Retirer i billes pour mettre l'adversaire dans une mauvaise position
				}
			}
		}
		 // Si aucune condition spécifique n'est remplie, retirer 1 bille par défaut
		return 1;
	}
	
	public static int randomInt(int a, int b)
	{
		// Génere un nombre aléatoire entre a et b
		return (int) (Math.random() * (b - a + 1)) + a;
	}

}
