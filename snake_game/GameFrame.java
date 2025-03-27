package snake_game;

import javax.swing.*;

/* 
 * Cette classe gère ce qu'on voit à l'écran, on crée des objets (menu principal, jeu snake, game over) et on 
 * les affiche sur la fenêtre
 */

public class GameFrame extends JFrame
{
	public GameFrame() 
	{
		this.setTitle("Snake Game");	// Titre de la fenètre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Quitter en appuyant sur la croix
		this.setResizable(false);	// La taille de la fenêtre ne peut pas être modifiée
		this.setSize(1000, 1000);	// Taille de la fenêtre
		this.setLocationRelativeTo(null);	// Centre la fenêtre sur l'écran
		
		// Ajouter le menu principal à la fenêtre et l'afficher
		this.setContentPane(new MainMenu(this));
		this.setVisible(true);
		
	}
}
