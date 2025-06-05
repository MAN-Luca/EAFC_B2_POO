package snake_game.projetEAFC;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	// Constructeur par défaut (au premier lancement du jeu)
	public GameFrame() {
		this(null); // Appelle l’autre constructeur avec aucun utilisateur sélectionné
	}

	// Constructeur avec utilisateur sélectionné
	public GameFrame(String selectedUser) {
		this.setContentPane(new MainMenu(this, selectedUser));
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // centre la fenêtre
	}
}
