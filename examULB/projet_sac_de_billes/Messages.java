package examULB.projet_sac_de_billes;

public class Messages
{
	String inter = "================================================================================================================";
	String message_1 = "Bonjour ! Bienvenue au jeu du Sac de Billes. \nJe suis une IA mais j'aimerais voir si tu peux gagner contre moi !";
	String entree_1 = "Entrez la graine: ";
	
	String message_2 = "Voici un rappel des règles :\n"
			+ "Tout d'abord, tu vas choisir combien de billes sont dans le sac."
			+ "\nChacun son tour (je te laisse commencer), on en retire 1, 2, 3 ou 4."
			+ "\nCelui qui retire la dernière bille a perdu.";
			
	String entree_2 = "A présent, merci de m'indiquer combien de billes tu choisis au total dans le sac avant de lancer la partie. "
			+ "\nMinimum 6 - Maximum 40 : ";
	String entree_2_1 = "Erreur, veuillez saisir un nombre de billes entre 6 et 40 : ";
			
	String message_3 = "Que la partie commence !";
	
	String message_4 = "C'est à toi de jouer. Il reste %d billes.";
	
	String entree_3 = "Combien de billes retires-tu ? 1, 2, 3 ou 4 ? ";
	String entree_3_1 = "Erreur, veuillez saisir un nombre de billes entre 1 et 4 : ";
	
	String message_5 = "Il reste à présent %d billes.";
	
	String message_6 = "C'est à moi de jouer.";
	
	String message_7 = "J'ai choisi de retirer %d bille(s).";
	
	String message_8 = "Il ne reste qu'une seule bille dans le sac... "
			+ "\net c'est à moi de jouer... "
			+ "\nC'est bon, tu as gagné ! Bravo !";
	
	String entree_4 = "Veux-tu jouer une nouvelle partie ? 1 = oui / 0 = non : ";
	
	String message_9 = "Il ne reste qu'une seule bille dans le sac... "
			+ "\net c'est à toi de jouer... \n"
			+ "J'ai donc gagné !";
	
	String entree_4_1 = "Réponse invalide. Veuillez répondre par 'OUI' ou 'NON'.";
	String message_10 = "Merci d'avoir joué ! \nA la prochaine :D";
}
